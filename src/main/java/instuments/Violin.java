package instuments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private int numberOfStrings;


    public Violin(String colour, String type, int numberOfStrings, IPlay playNoise) {
        super(colour, type, playNoise);
        this.numberOfStrings = numberOfStrings;
        this.playNoise = playNoise;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "La la la";
    }
}
