package task1;


import static task1.Logic.*;

public class App {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Integer number = readInt();

        if (number != null) {
            printAnswer(number);
        } else {
            invalidInput();
        }
    }
}
