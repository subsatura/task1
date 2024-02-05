package lesson.second;

import java.util.Scanner;

/*
4. Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class IntString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String b = sc.nextLine();
        System.out.println("Times to multiply: ");
        int a = sc.nextInt();
        stringNtimes(b,a);
    }
    public static void stringNtimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

}
