package instuments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;
    private int numberOfFrets;
    private String typeOfStrings;

    public Guitar(String colour, String type, int numberOfStrings, int numberOfFrets, String typeOfStrings, IPlay playNoise) {
        super(colour, type, playNoise);
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
        this.typeOfStrings = typeOfStrings;
        this.playNoise = playNoise;

    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

    public String getTypeOfStrings() {
        return typeOfStrings;
    }

    @Override
    public String play() {
        return "de de de";
    }
}
