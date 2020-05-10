package task1;

import java.util.Scanner;

class Logic {
    static Integer readInt() {
        Scanner in = new Scanner(System.in);
        return in.hasNextInt() ? in.nextInt() : null;
    }

    static void printAnswer(int number) {
        System.out.printf("%d - %s and %s.",
                number,
                isPrime(number) ? "prime" : "composite",
                isEven(number) ? "even" : "odd");
    }

    static void invalidInput() {
        System.out.println("Invalid input.");
    }

    private static boolean isPrime(int num) {
        int temp;

        if (isEven(num)) {
            return num == 2;
        }

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
