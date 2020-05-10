package task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the sequence from 0 to 100: ");
        try {
            int number = in.nextInt();
            if (!(number < MIN_VALUE || number > MAX_VALUE)) {
                for (int i = MIN_VALUE; i < number + 1; i++) {
                    if (Logic.isPalindrome(i)) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                System.out.println("length < 0 || length > 100.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
