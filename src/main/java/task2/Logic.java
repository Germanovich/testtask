package task2;

class Logic {
    static int gcd(int firstNumber, int secondNumber) {
        if (firstNumber == 0 && secondNumber == 0) {
            throw new IllegalArgumentException("firstNumber && secondNumber = 0");
        }
        return secondNumber == 0 ? firstNumber : gcd(secondNumber, firstNumber % secondNumber);
    }

    static int lcm(int firstNumber, int secondNumber) {
        if (firstNumber == 0 && secondNumber == 0) {
            throw new IllegalArgumentException("firstNumber && secondNumber = 0");
        }
        return firstNumber / gcd(firstNumber, secondNumber) * secondNumber;
    }
}
