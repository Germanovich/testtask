package task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Logic {
    static int getWordCount(String text, String word) {
        if (word.equals("") || text.equals("")) {
            throw new IllegalArgumentException("Invalid input");
        }
        int wordCount = 0;

        text = text.toLowerCase();
        word = word.toLowerCase();

        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }

    static String readText() {
        Scanner in = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String line;

        while (true) {
            line = in.nextLine();

            if (line.equals("")) {
                if (builder.toString().isEmpty()) {
                    throw new InputMismatchException("Empty text");
                }
                return builder.toString();
            }
            builder.append(line).append('\n');
        }
    }

    static String readWord() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        if (word.isEmpty())
            throw new InputMismatchException("Empty word");
        return word;
    }
}
