package com.itava0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My house", "05/10/2018",450_000.00, "2404 Wildburne CT, Charlotte, NC 28262", 1, 3258, 2));
        assets.add(new House("My vacation home", "05/10/218",1_450_000.00, "2404 Market st, Charlotte, NC 28262", 1, 3258, 2));
        assets.add(new Vehicle("Ivan's car", "05/10/2015", 32_950, "Lexus IS350 Sport", 2015, 12_000));
        assets.add(new Vehicle("Jay's car", "05/10/2020", 32_000.00, "Honda Accord", 2020, 46_000));

        for(int i = 0; i < 4; i ++) {
            if (assets.get(i) instanceof House house) {
                System.out.printf("%s was %s is the original cost is %.2f \n", house.getDescription(), house.getDateAcquired(), house.getValue());
            } else if (assets.get(i) instanceof Vehicle vehicle) {
                System.out.printf("%s was %s is the original cost is %.2f \n", vehicle.getDescription(), vehicle.getDateAcquired(), vehicle.getValue());
            }
        }
    }
}
