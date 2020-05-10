package task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Book", 1, 600));
        items.add(new Item("Book", 1, 500));
        items.add(new Item("Binoculars", 1, 2000));
        items.add(new Item("Binoculars", 3, 6000));
        items.add(new Item("Medicine chest", 4, 1500));
        items.add(new Item("Medicine chest", 5, 2200));
        items.add(new Item("Laptop", 2, 33000));
        items.add(new Item("Laptop", 2, 25000));
        items.add(new Item("Сigar-lighter", 1, 500));
        items.add(new Item("Сigar-lighter", 2, 700));

        System.out.println("Items:");
        for (Item item : items) {
            System.out.println(item.toString());
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter maximum backpack weight: ");

        try {
            double number = in.nextDouble();

            Backpack backpack = new Backpack(number);
            backpack.makeAllSets(items);

            List<Item> solve = backpack.getBestItems();

            if (solve != null) {
                System.out.println("Decision:");
                for (Item item : solve) {
                    System.out.println(item.toString());
                }
            }
            else {
                System.out.println("There is no decision!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
