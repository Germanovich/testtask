package task4;

import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the text: ");
            String text = Logic.readText();
            System.out.println("Enter the word: ");
            String word = Logic.readWord();

            System.out.printf("The word \"%s\" occurs in the text %d times", word, Logic.getWordCount(text, word));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
