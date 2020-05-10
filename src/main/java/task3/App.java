package task3;

import java.util.InputMismatchException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");

        try {
            String line = Logic.readLine();

            List<String> words = Logic.getWords(line);
            System.out.println("Count of words: " + words.size());
            Logic.sort(words);

            System.out.print(words);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

