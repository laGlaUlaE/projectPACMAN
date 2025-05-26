package gameObjects;

import abstracts.Controllable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;

public class Player extends Controllable {

    private boolean isWinner;
    private int life;
    private Coordinates initialCoordinates;
    private Direction direction;

// Costruttore: inizializza le coordinate e lo stato del giocatore
    public Player(Coordinates coordinates) {
        super(coordinates);
        this.coordinates = coordinates;
        this.initialCoordinates = new Coordinates(coordinates.getRow(), coordinates.getCol());
        this.life = 3; // vite iniziali
        this.isWinner = false;
        this.direction = Direction.UP;
    }

    @Override
    public void move(Direction direction) {
        // Aggiorna la direzione del movimento
        setDirection(direction);
    }

    @Override
    public void update() {
        // Aggiorna la posizione del giocatore in base alla direzione
        Coordinates new newCoords = getNextCoordinates(direction); 
        this.coordinates = newCoords;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public boolean isLooser() {
        // Il giocatore ha perso se ha finito le vite
        return life <= 0;
    }

    public void markAsWinner() {
        isWinner = true;
    }

    public void handleDamage() {
        // Riduce le vite di 1 (ma non va sotto zero)
        if (life > 0) {
            life--;
        }
    }

    @Override
    public DrawingInformation draw() {
        // Disegna Pac-Man come un cerchio giallo 
        return new DrawingInformation('P', Color.YELLOW);
    }

    public void resetCoordinates() {
        // Riporta il giocatore alla posizione iniziale
        this.coordinates = new Coordinates (initialCoordinates.getRow(), initialCoordinates.getCol());
       
    }

    public int getLife() {
        return life;
    }
}
