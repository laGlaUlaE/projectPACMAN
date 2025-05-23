package gameObjects;

import abstracts.Controllable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;

public class Player extends Controllable {

    public Player(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public void move(Direction direction) {
        //TODO IMPLEMENT
    }

    @Override
    public void update() {
        //TODO IMPLEMENT
    }

    public boolean isWinner() {
        //TODO IMPLEMENT
        return false;
    }

    public boolean isLooser() {
        //TODO IMPLEMENT
        return false;
    }

    public void markAsWinner() {
        //TODO IMPLEMENT
    }

    public void handleDamage() {
        //TODO IMPLEMENT
    }

    @Override
    public DrawingInformation draw() {
        return new DrawingInformation(' ', Color.BLACK);
    }

    public void resetCoordinates() {
        //TODO IMPLEMENT
    }

    public int getLife() {
        //TODO IMPLEMENT
        return 0;
    }
}
