package instuments;

public class Violin extends Intrument {

    private int numberOfStrings;


    public Violin(String colour, String type, int numberOfStrings) {
        super(colour, type);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
