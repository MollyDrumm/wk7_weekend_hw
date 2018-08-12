package instuments;

public class Piano extends Intrument {
    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(String colour, String type, int numberOfKeys, int numberOfPedals) {
        super(colour, type);
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
