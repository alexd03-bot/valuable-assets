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

    public ArrayList<Truck>  getTrucks() {
        ArrayList<Truck> trucks = new ArrayList<>();
        for (Valuable v: valuables) {
            if (v instanceof Truck) {
                Truck t = (Truck) v;
                trucks.add(t);
            }
        }
        return trucks;
    }

    public double getValue() {
        return 0;
    }

}
