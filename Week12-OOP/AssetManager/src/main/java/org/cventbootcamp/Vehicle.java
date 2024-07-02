package org.cventbootcamp;

public class Vehicle extends Asset {
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

    public int getYear() {
        return year;
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
        if (year > 0 && year <= 3) {
            originalCost = originalCost - (year * 0.03);
        } else if (year > 3 && year <= 6) {
            originalCost = originalCost - (year * 0.06);
        } else if (year > 6 && year <= 10) {
            originalCost = originalCost - (year * 0.08);
        } else if (year > 10 && year <= 12) {
            originalCost = 1000.00;
        }

        if (odometer > 1000000 && !(makeModel.equals("Honda") || makeModel.equals("Toyota"))) {
            originalCost -= odometer * 0.25;
        }
        return originalCost;

    }

}