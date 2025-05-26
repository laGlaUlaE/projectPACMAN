package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Wall extends Drawable {


    public Wall(Coordinates coords) {
        super(coords);
        //TODO IMPLEMENT
    }


    @Override
    public void update() {
        //TODO IMPLEMENT
    }

    @Override
    public DrawingInformation draw() {
        //TODO IMPLEMENT
        return new DrawingInformation(' ', Color.BLACK);
    }

}
