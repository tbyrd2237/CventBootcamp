package org.cventbootcamp;

public class Main {
    public static void main(String[] args) {
        //Hovercraft
        Hovercraft myHovercraft = new Hovercraft();
        myHovercraft.setColor("Pink");
        myHovercraft.setNumberOfPassengers(1);
        myHovercraft.setCargoCapacity(0);
        myHovercraft.setFuelCapacity(0);
        myHovercraft.setHoverHeight(100);

        //Moped
        Moped myMoped = new Moped();
        myMoped.setColor("Red");
        myMoped.setNumberOfPassengers(1);
        myMoped.setCargoCapacity(0);
        myMoped.setFuelCapacity(5);
        myMoped.setMaxSpeed(100);

        //SemiTruck
        SemiTruck mySemitruck = new SemiTruck();
        mySemitruck.setColor("White");
        mySemitruck.setNumberOfPassengers(2);
        mySemitruck.setCargoCapacity(250);
        mySemitruck.setFuelCapacity(100);
        mySemitruck.setTowingWeight(1000);

        //Car
        Car myCar = new Car();
        myCar.setColor("Green");
        myCar.setNumberOfPassengers(7);
        myCar.setCargoCapacity(100);
        myCar.setFuelCapacity(50);
        myCar.setElectric(true);

    }
}