package instuments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements ISell {
    private int numberOfKeys;
    private int numberOfPedals;
    private int buyInPrice;
    private int sellPrice;


    public Piano(String colour, String type, int numberOfKeys, int numberOfPedals, IPlay playNoise, int buyInPrice, int sellPrice) {
        super(colour, type, playNoise);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
        this.buyInPrice = buyInPrice;
        this.sellPrice = sellPrice;

    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public int getBuyInPrice() {
        return buyInPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup(int buyInPrice, int sellPrice) {
        return sellPrice - buyInPrice;
    }
}

