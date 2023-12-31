package com.pluralsight;

public abstract class Asset {
//test
    protected String description;

    protected String dateAquired;

    protected double originalCost;


    public Asset(String description, String dateAquired, double originalCost) {
        this.description = description;
        this.dateAquired = dateAquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public void setDateAquired(String dateAquired) {
        this.dateAquired = dateAquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }


  public abstract double getValue();


}
