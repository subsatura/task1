package lesson.second;

import java.util.Scanner;
/*
9.* Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */
public class arrIntVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length:");
        int len = sc.nextInt();
        System.out.println("Initial value:");
        int initialValue = sc.nextInt();
        int[] resultArray = createArray(len, initialValue);
        System.out.println("Array with length " + len + " and initial value " + initialValue + ": "
                    + java.util.Arrays.toString(resultArray));
        }
        public static int[] createArray(int len, int initialValue) {
            int[] newArray = new int[len];
            for (int i = 0; i < len; i++) {
                newArray[i] = initialValue;
            }
            return newArray;
        }
}
