package lesson.eighth.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = WordGenerator.generateWords(); // Генерируем массив слов
        Map<String, Integer> wordCount = WordCounter.countWords(words); // Подсчитываем количество повторений слов
        List<String> uniqueWords = new ArrayList<>(wordCount.keySet()); // Получаем список уникальных слов

        System.out.println("Уникальные слова:"); // Выводим список уникальных слов
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество повторений каждого слова:"); // Выводим количество повторений каждого слова
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}