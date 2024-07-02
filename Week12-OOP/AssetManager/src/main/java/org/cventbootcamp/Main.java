package org.cventbootcamp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        Asset houseOne = new Asset("My primary residence", "July 2, 2024",  600000);
        Asset houseTwo = new Asset("My vacation home", "July 4, 2024",  750000);

        assets.add(houseOne);
        assets.add(houseTwo);

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Value $" + asset.getValue());
            System.out.println();
        }
    }
}