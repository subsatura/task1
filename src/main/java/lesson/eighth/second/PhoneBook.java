package lesson.eighth.second;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() { // Конструктор
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) { // Добавляем записи
        Set<String> numbers = phoneBook.getOrDefault(lastName, new HashSet<>()); // Привязываем значение к ключу
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public Set<String> get(String lastName) { // Получение всех номеров телефонов, связанных с определенной фамилией
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }

    public void printAllEntries() { // Проход по всем записям и вывод каждой
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            System.out.println("Номера телефонов для фамилии " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
