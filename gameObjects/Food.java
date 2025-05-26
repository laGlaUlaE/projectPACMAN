package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Food extends Drawable {

    public Food(Coordinates coords) {
        super(coords);
        //TODO: IMPLEMENT
    }

    @Override
    public void update() {}

    @Override
    public DrawingInformation draw() {
        //TODO: IMPLEMENT
        return new DrawingInformation(' ', Color.BLACK);
    }

    public void markAsDeleted() {
        //TODO: IMPLEMENT
    }

    public boolean isDeleted() {
        //TODO: IMPLEMENT
        return false;
    }

}
