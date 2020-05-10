package task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Logic {

    static List<String> getWords(String line) {
        ArrayList<String> arrayList = new ArrayList<>();

        String[] words = line.split(" ");
        for (String word : words) {
            arrayList.add(firstUpperCase(word));
        }
        return arrayList;
    }

    static void sort(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size() - 1 - i; j++) {
                if (strings.get(j).length() > strings.get(j + 1).length()) {

                    String bufferStr = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, bufferStr);
                }
            }
        }
    }

    static String readLine() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        if (line.isEmpty()) {
            throw new InputMismatchException("Empty line");
        }
        return line;
    }

    private static String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
