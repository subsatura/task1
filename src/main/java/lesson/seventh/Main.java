package lesson.seventh;

import java.io.IOException;
//1. Реализовать сохранение данных в csv файл;
//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
//Структура csv файла:
//Строка заголовок с набором столбцов
//Набор строк с целочисленными значениями
//* Разделитель между столбцами - символ точка с запятой (;)
//Пример:
//Value 1;Value 2;Value 3
//        100;200;123
//        300;400;500
//Для хранения данных использовать класс вида:
//public class AppData {
//    private String[] header;
//    private int[][] data;
//}
//Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.

public class Main {

    public static void main(String[] args) {
        AppData appData = new AppData(new String[]{"Значение 1", "Значение 2", "Значение 3"},        // Создаем объект AppData, объявляем заголовки и данные
                new int[][]{{4572, 6778, 6456}, {9642, 6324, 5623}, {4367, 2456, 7824}, {3232, 5556, 2354}});

        try {         // Сохраняем данные в файл в корне проекта по умолчанию
            appData.save("data.csv");
            System.out.println("Данные успешно сохранены в файл data.csv");
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении данных: " + e.getMessage());
        }

        try {        // Загружаем данные из файла
            AppData loadedData = new AppData();
            loadedData.load("data.csv");
            System.out.println("Данные успешно загружены из файла:");
            printData(loadedData);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке данных: " + e.getMessage());
        }
    }

    private static void printData(AppData appData) {    // Вспомогательный метод для печати данных
        System.out.println("Заголовок:");
        for (String header : appData.getHeader()) {
            System.out.print(header + ";");
        }
        System.out.println("\nДанные:");
        for (int[] row : appData.getData()) {
            for (int value : row) {
                System.out.print(value + ";");
            }
            System.out.println();
        }
    }
}
