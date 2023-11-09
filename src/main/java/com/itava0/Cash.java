package com.itava0;

public class Cash extends Asset{
    private double moneySaved;

    public Cash(String description, String dateAcquired, double originalCost, double moneySaved) {
        super(description, dateAcquired, originalCost);
        this.moneySaved = moneySaved;
    }

    @Override
    public double getValue() {
        return this.moneySaved;
    }

}
