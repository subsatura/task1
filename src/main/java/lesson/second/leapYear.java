package lesson.second;
/*
 Написать метод, который определяет, является ли год високосным,
 и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Year: ");
        int year = sc.nextInt();
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        /*Год является високосным, если он делится на 4, и если год делится на 100,
        чтобы быть високосным, он также должен делиться на 400 */
    }
}
