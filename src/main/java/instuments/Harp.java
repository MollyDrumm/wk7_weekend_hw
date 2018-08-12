package instuments;

public class Harp extends Intrument{
    private int numberOfStrings;
    private String typeOfHarp;

    public Harp(String colour, String type, int numberOfStrings) {
        super(colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
