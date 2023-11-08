package com.itava0;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double depreciationRate;
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - this.year;

        if (age >= 0 && age <= 3) {
            depreciationRate = 0.03; // 3% depreciation per year for the first 3 years
        } else if (age >= 4 && age <= 6) {
            depreciationRate = 0.06;// 6% depreciation per year for the next 3 years
        } else if(age >= 7 && age <= 10) {
            depreciationRate = 0.08; //8% depreciation per year for the next 3 years
        } else {
            depreciationRate = 1000.00;
        }

        // Check if the car has over 100,000 miles and doesn't contain "Honda" or "Toyota" in the makeModel
        boolean isHighMileage = this.odometer > 100000;
        boolean isExcludedMakeModel = !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota");

        if (isHighMileage && isExcludedMakeModel) {
            depreciationRate += 0.25; // Reduce value by an additional 25%
        }

        // Calculate the current value
        double currentCarValue = getOriginalCost();
        for (int i = 0; i < age; i++) {
            currentCarValue -= currentCarValue * depreciationRate;
        }

        return currentCarValue;
    }
}
