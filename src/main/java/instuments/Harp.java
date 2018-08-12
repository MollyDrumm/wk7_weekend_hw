package instuments;

import behaviours.IPlay;

public class Harp extends Instrument implements IPlay {
    private int numberOfStrings;


    @Override
    public String play(String sound) {
        return play(sound);
    }

    public Harp(String colour, String type, int numberOfStrings, IPlay playNoise) {
        super(colour, type, playNoise);
        this.numberOfStrings = numberOfStrings;
        this.playNoise = playNoise;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
