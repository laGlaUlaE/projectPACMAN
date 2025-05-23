package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ghost extends Drawable {
	
	/**attibuti necessari*/
	private Direction currentDirection; //serve per capire la direzione attuale del fantasma
	private ArrayList<Direction> availableDirections; //lista delle direzioni disponibili in cui si puo' muovere
	

	/**oggetto random utile per scegliere la direzione da prendere*/
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
    public void update() {
    	
        //TODO: IMPLEMENT
        if (!availableDirections.contains(currentDirection)) {
            /**trovo la direzione opposta alla attuale*/
            Direction opposite = Direction.getOpposite(currentDirection);

            /**filtro le direzioni ed escludo quella opposta*/
            ArrayList<Direction> filtered = new ArrayList<>();
            for (Direction dir : availableDirections) {
                if (dir != opposite) {
                    filtered.add(dir);
                }
            }
            /**se tutte sono opposte scelgo qualcosa tra le disponibili*/
            if (filtered.isEmpty()) {
                filtered = availableDirections;
            }
            /**scelgo una direzione tra le disponibili*/
            currentDirection = filtered.get(random.nextInt(filtered.size()));
        }
    }
    
    /** Metodo privato che calcola nuove coordinate in base alla direzione data*/
    private Coordinates getNextCoordinates(Direction direction) {
        int row = coordinates.getRow();
        int col = coordinates.getCol();

        switch (direction) {
            case UP:    row -= 1; break;
            case DOWN:  row += 1; break;
            case LEFT:  col -= 1; break;
            case RIGHT: col += 1; break;
        }
        /**Ritorna un nuovo oggetto Coordinates con la nuova posizione*/
        return new Coordinates(row, col);
    }

    /**metoto per passare alla grafica il simbolo e il colore del fantasma*/
    @Override
    public DrawingInformation draw() {
    	
        //TODO: IMPLEMENT
        return new DrawingInformation('☻', Color.magenta);
    }
}
