package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ghost extends Drawable {
	
	/**attibuti*/
	private Direction currentDirection; //serve per capire la direzione attuale del fantasma
	private ArrayList<Direction> availableDirections; //lista delle direzioni disponibili in cui si puo' muovere
	

	/**oggetto random per scegliere la direzione da prendere*/
	private static final Random random = new Random();
	
	/**costruttore*/
    public Ghost(Coordinates coords) {
        super(coords);
        
        //TODO: IMPLEMENT
        this.currentDirection = Direction.UP; //direzione iniziale
        this.availableDirections = new ArrayList<>();
    }
    
    /**metodo che serve per dire al fantasma quali direzioni sono libere dai muri*/
    public void setAvailDirections(ArrayList<Direction> availDirections) {
        
    	//TODO: IMPLEMENT
    	this.availableDirections = availDirections;
    }

    /**metodo che viene chiamato ogni volta che viene aggiornato lo stato*/
    @Override
    public void update(){
        //50% di probabilità di cambiare direzione anche se la direzione attuale e' ancora valida
        boolean forceChange = random.nextDouble() < 0.55;

        //cambia direzione c'e' un vicolo cieco o se la direzione attuale non e' più disponibile
        if (forceChange || !availableDirections.contains(currentDirection)){
            //ottieni la direzione opposta a quella attuale per evitare di tornare indietro
            Direction opposite = Direction.getOpposite(currentDirection);

            //crea una lista delle direzioni disponibili che non sono opposte alla direzione attuale
            ArrayList<Direction> filtered = new ArrayList<>();
            for (Direction dir : availableDirections) {
                if (dir != opposite) {
                    filtered.add(dir); //aggiunge solo direzioni diverse da quella opposta
                }
            }

            //se tutte le direzioni disponibili erano opposte, allora si considerano comunque
            if (filtered.isEmpty()) {
                filtered = availableDirections;
            }

            //se c'e' almeno una direzione disponibile, scelgo una direzione casuale tra quelle filtrate
            if (!filtered.isEmpty()) {
                currentDirection = filtered.get(random.nextInt(filtered.size()));
            }
        }

        //aggiorno le coordinate del fantasma spostandolo nella direzione scelta
        coordinates = getNextCoordinates(currentDirection);
    }

    /**Metodo privato che calcola nuove coordinate in base alla direzione data*/
    private Coordinates getNextCoordinates(Direction direction) {
        int row = coordinates.getRow();
        int col = coordinates.getCol();

        switch (direction) {
            case UP:    row -= 1; break;
            case DOWN:  row += 1; break;
            case LEFT:  col -= 1; break;
            case RIGHT: col += 1; break;
        }
        //Ritorna un nuovo oggetto Coordinates con la nuova posizione
        return new Coordinates(row, col);
    }

    
    /**metodo per passare alla grafica il simbolo e il colore del fantasma*/
    @Override
    public DrawingInformation draw() {
    	
        //TODO: IMPLEMENT
        return new DrawingInformation('G', Color.magenta);
    }
}
