package instuments;

public class Piano {
    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(int numberOfKeys, int numberOfPedals) {
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
