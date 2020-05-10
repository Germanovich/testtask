package task6;

import java.util.List;

public class Logic {

    static double calcWeight(List<Item> items) {
        double sumWeight = 0;

        for (Item i : items) {
            sumWeight += i.getWeight();
        }
        return sumWeight;
    }

    static double calcPrice(List<Item> items) {
        double sumPrice = 0;

        for (Item i : items) {
            sumPrice += i.getPrice();
        }
        return sumPrice;
    }
}
