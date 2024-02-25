package lesson.eighth.first;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
