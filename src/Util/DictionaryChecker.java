package Util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class DictionaryChecker {
    private static final HashSet<String> dictionary = getDictionary("..\\lib\\Dictionary.txt");

    private static HashSet<String> getDictionary(String fileName) {
        HashSet<String> dictionary = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.add(line.trim().toLowerCase()); // Trim to remove leading/trailing whitespace and convert to lowercase
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dictionary;
    }

    public static boolean isExist(String word) {
        return dictionary.contains(word.toLowerCase());
    }

    public static int differentChar(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
