package shops;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;

    }


    public ArrayList<ISell> stock() {
        return stock;
    }
}
