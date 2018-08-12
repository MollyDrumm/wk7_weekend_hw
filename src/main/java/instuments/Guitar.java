package instuments;

public class Guitar {
    private int numberOfStrings;
    private int numberOfFrets;
    private String typeOfStrings;

    public Guitar(int numberOfStrings, int numberOfFrets, String typeOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
        this.typeOfStrings = typeOfStrings;
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
}
