package org.cventbootcamp;

public class Room {
    //Attributes
    public int numberOfBeds;
    public double price;
    public Boolean isOccupied;
    public Boolean isDirty;
    public Boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        if(!isOccupied && !isDirty){
            return true;
        }
        else{
            return false;
        }
    }
}
