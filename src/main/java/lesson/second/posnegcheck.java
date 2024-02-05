package lesson.second;

import java.util.Scanner;

public class posnegcheck {
    /*
    2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number: ");
        x = scanner.nextInt();
        if (x>=0) {
            System.out.println("Your number is positive");
        }
        else {
            System.out.println("Your number is negative");
        }
    }
}
