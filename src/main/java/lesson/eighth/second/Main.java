package lesson.eighth.second;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "7888431242");        // Добавляем записи в телефонную книгу
        phoneBook.add("Петров", "3248972389");
        phoneBook.add("Иванов", "2347239472");
        phoneBook.add("Сидоров", "45365676342");
        phoneBook.add("Качалкин", "79856453267");
        phoneBook.add("Сидоров", "23456787653");
        phoneBook.add("Иванов", "8923456754");
        phoneBook.add("Мочалкин", "2346232171");
        phoneBook.add("Белкин", "3455686754");
        phoneBook.printAllEntries();
    }
}
