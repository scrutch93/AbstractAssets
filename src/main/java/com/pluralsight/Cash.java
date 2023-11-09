package com.pluralsight;

public class Cash extends Asset {

    public Cash(String description, String dateAquired, double originalCost) {
        super(description, dateAquired, originalCost);
    }

    public double getValue(){


        return originalCost;
    }
}
