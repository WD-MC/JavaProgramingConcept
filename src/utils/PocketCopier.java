package src.utils;

import src.imutable.Pocket;

public class PocketCopier {
    // le constructeur permet d'implémenter le design pattern
    private PocketCopier(){

    }
    public static Pocket copyOf(Pocket pocket){
        return new Pocket(pocket.name);
    }
}
