package instuments;

import behaviours.IPlay;

public class Piano extends Instrument {
    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(String colour, String type, int numberOfKeys, int numberOfPedals, IPlay playNoise) {
        super(colour, type, playNoise);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
