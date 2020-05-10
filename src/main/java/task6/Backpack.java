package task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Item> bestItems;

    private double maxWeight;

    private double bestPrice;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Item> getBestItems() {
        return bestItems;
    }

    public void setBestItems(List<Item> bestItems) {
        this.bestItems = bestItems;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(double bestPrice) {
        this.bestPrice = bestPrice;
    }

    private void CheckSet(List<Item> items) {
        if (bestItems == null) {
            if (Logic.calcWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = Logic.calcPrice(items);
            }
        } else {
            if (Logic.calcWeight(items) <= maxWeight && Logic.calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = Logic.calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            CheckSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<Item>(items);

            newSet.remove(i);
            makeAllSets(newSet);
        }
    }
}
