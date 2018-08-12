package instuments;

public class Harp {
    private int numberOfStrings;
    private String typeOfHarp;

    public Harp(int numberOfStrings, String typeOfHarp) {
        this.numberOfStrings = numberOfStrings;
        this.typeOfHarp = typeOfHarp;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getTypeOfHarp() {
        return typeOfHarp;
    }
}
