package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;
import java.util.ArrayList;

public class Ghost extends Drawable {

    public Ghost(Coordinates coords) {
        super(coords);
        //TODO: IMPLEMENT
    }

    public void setAvailDirections(ArrayList<Direction> availDirections) {
        //TODO: IMPLEMENT
    }

    @Override
    public void update() {
        //TODO: IMPLEMENT
    }

    @Override
    public DrawingInformation draw() {
        //TODO: IMPLEMENT
        return new DrawingInformation(' ', Color.BLACK);
    }
}
