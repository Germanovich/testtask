package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int firstNumber = in.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = in.nextInt();

            System.out.printf("Greatest Common Divisor: %d\nLeast Common Multiple: %d",
                    Logic.gcd(firstNumber, secondNumber), Logic.lcm(firstNumber, secondNumber));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
