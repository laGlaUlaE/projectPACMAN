package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Food extends Drawable {
    private boolean cancella;

    public Food(Coordinates coords) {
        super(coords);

        //TODO: IMPLEMENT
        this.cancella = false; //Flag per indicare se il cibo è stato mangiato o meno (inizialmente no)
    }

    @Override
    public void update() {} //Non necessario per via dell'implementazione che già è presente

    @Override
    public DrawingInformation draw() {
        //TODO: IMPLEMENT
        if(cancella) return new DrawingInformation(' ', Color.BLACK) ; //Cibo mangiato
        else return new DrawingInformation('f', Color.YELLOW) ; //Cibo non mangiato
    }

    public void markAsDeleted() { //Segna se il cibo è stato mangiato
        //TODO: IMPLEMENT
        this.cancella = true; //Il giocatore ha fatto una collisione con food
    }

    public boolean isDeleted() { //Verifica se il cibo è stato mangiato
        //TODO: IMPLEMENT
        //return false
        return this.cancella; //Restituisce il valore effettivo di "cancella" che dovrebbe essere false, sennò si andrebbe in markAsDeleted()
    }

}
