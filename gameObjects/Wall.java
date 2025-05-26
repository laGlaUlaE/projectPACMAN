package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Wall extends Drawable {
    //Drawable -> classe astratta, base degli oggetti visualizzabili e aggiornabili
    private static final char muro = 'w'; 
    private static final Color coloremuro = new Color(70, 70, 200); 

    public Wall(Coordinates coords) {
        super(coords);

        //TODO IMPLEMENT
        
    }


    @Override
    public void update() {
        //TODO IMPLEMENT
        //I muri sono statici, non vi sono variazioni
    }

    @Override
    public DrawingInformation draw() {
        //TODO IMPLEMENT
        return new DrawingInformation(muro, coloremuro);
    }

}
