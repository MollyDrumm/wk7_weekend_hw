package instuments;


public class Harp extends Instrument {
    private int numberOfStrings;



    public Harp(String colour, String type, int numberOfStrings) {
        super(colour, type);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



}
