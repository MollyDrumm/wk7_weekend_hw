package instuments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    protected String colour;
    protected String type;

    public Instrument(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String play(){
        return "noise";
    }


}


/*

 Diagram -> Test -> Code -> Repeat
 10-15mis

 */