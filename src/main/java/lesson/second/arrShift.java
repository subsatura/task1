package lesson.second;

import java.util.Scanner;

/*
Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */
public class arrShift {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int len = scanner.nextInt();
    int[] array = new int[len];
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < len; i++) {
        array[i] = scanner.nextInt();
    }
    System.out.print("Enter the shift value N: ");
    int n = scanner.nextInt();
    System.out.println("Original array: " + java.util.Arrays.toString(array));
    shiftArray(array, n);

    System.out.println("Shifted array by " + n + " positions: " + java.util.Arrays.toString(array));
    }

    public static void shiftArray(int[] array, int n) {
        int len = array.length;
        n = n % len; //модуль
        if (n < 0) {
            n = len + n;
        }
        for (int shift = 0; shift < n; shift++) {
            int lastElement = array[len - 1];
            for (int i = len - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }
    }
}
