package instuments;

import behaviours.IPlay;

public abstract class Instrument  {
    protected String colour;
    protected String type;
    protected IPlay playNoise;

    public Instrument(String colour, String type, IPlay playNoise) {
        this.colour = colour;
        this.type = type;
        this.playNoise = playNoise;
    }



    public IPlay getPlayNoise() {
        return playNoise;
    }

}
