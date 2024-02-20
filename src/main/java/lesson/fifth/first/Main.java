package lesson.fifth.first;
//Написать метод, который меняет два элемента массива местами
// (массив может быть любого ссылочного типа)

import java.util.Arrays;

import static lesson.fifth.first.ArrayUtils.swap;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(intArray));

        swap(intArray, 4, 0); // Меняем местами элементы с индексами 4 и 0
        System.out.println("Массив после обмена: " + Arrays.toString(intArray));
    }
}
