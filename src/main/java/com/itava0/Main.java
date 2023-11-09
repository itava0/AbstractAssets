package com.itava0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My house", "05/10/2018",450_000.00, "2404 Wildburne CT, Charlotte, NC 28262", 1, 3258, 2));
        assets.add(new House("My vacation home", "05/10/218",1_450_000.00, "2404 Market st, Charlotte, NC 28262", 1, 3258, 2));
        assets.add(new Vehicle("Ivan's car", "05/10/2015", 32_950, "Lexus IS350 Sport", 2015, 120_000));
        assets.add(new Vehicle("Jay's car", "04/22/2019", 12_300.32, "Lexus Accord", 2017, 200_000));
        assets.add(new Cash("Retirement", "02/10/2015", 250_000.00, 250_000.00));
//"van","04/22/2019",12300.32,"lexus van",2017,200000
        for(int i = 0; i < 4; i ++) {
            if (assets.get(i) instanceof House house) {
                System.out.printf("%s was purchased %s and the original cost was %.2f today's value is %.2f \n", house.getDescription(), house.getDateAcquired(), house.getOriginalCost(), house.getValue());
            } else if (assets.get(i) instanceof Vehicle vehicle) {
                System.out.printf("%s was purchased %s and the original cost was %.2f today's value is %.2f \n", vehicle.getDescription(), vehicle.getDateAcquired(),vehicle.getOriginalCost(), vehicle.getValue());
            } else if (assets.get(i) instanceof Cash money) {
                System.out.println("Money saved under the mattress $"+money.getValue());
            }
        }
    }
}
