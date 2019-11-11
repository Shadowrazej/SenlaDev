package com.tasks.task06;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int currentWeight;
    private int maxWeight;
    private List<Thing> thingsList;
    private List<Thing> thingsInBackpack;

    public Backpack(int maxWeight, List<Thing> thingsList) {
        this.maxWeight = maxWeight;
        this.thingsList = thingsList;
        this.thingsInBackpack = new ArrayList<Thing>();
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Thing> getThingsList() {
        return thingsList;
    }

    public void setThingsList(List<Thing> thingsList) {
        this.thingsList = thingsList;
    }

    public List<Thing> getThingsInBackpack() {
        return thingsInBackpack;
    }

    public void setThingsInBackpack(List<Thing> thingsInBackpack) {
        this.thingsInBackpack = thingsInBackpack;
    }

    public void packBackpack(List<Thing> thingsList) {
        sortThingsByPrice();
        for (int i = 0; i < thingsList.size(); i++) {
            currentWeight += thingsList.get(i).getWeight();
            if (currentWeight <= maxWeight) {
                thingsInBackpack.add(thingsList.get(i));
            } else {
                currentWeight -= thingsList.get(i).getWeight();
                continue;
            }
        }
    }

    private void sortThingsByPrice() {
        int temp = 0;
        for (int i = 0; i < thingsList.size(); i++) {
            for (int j = 1; j < (thingsList.size() - i); j++) {
                if (thingsList.get(j - 1).getPrice() < thingsList.get(j).getPrice()) {
                    temp = thingsList.get(j - 1).getPrice();
                    thingsList.get(j - 1).setPrice(thingsList.get(j).getPrice());
                    thingsList.get(j).setPrice(temp);
                }
            }
        }
    }
}
