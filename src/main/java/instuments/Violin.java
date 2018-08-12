package instuments;

public class Violin {

    private int numberOfStrings;
    private String typeOfViolin;

    public Violin(int numberOfStrings, String typeOfViolin) {
        this.numberOfStrings = numberOfStrings;
        this.typeOfViolin = typeOfViolin;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getTypeOfViolin() {
        return typeOfViolin;
    }
}
