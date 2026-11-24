package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    ArrayList<Valuable> valuables = new ArrayList<>();
    public Portfolio() {
        this.valuables = new ArrayList<>();
    }
    public void addValuable(Valuable valuable) {
        this.valuables.add(valuable);
    }


}
