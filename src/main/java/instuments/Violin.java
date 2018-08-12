package instuments;

import behaviours.IPlay;

public class Violin extends Instrument  {

    private int numberOfStrings;



    public Violin(String colour, String type, int numberOfStrings, IPlay playNoise) {
        super(colour, type, playNoise);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playViolinNoise(){
        return "La la la";
    }


}
