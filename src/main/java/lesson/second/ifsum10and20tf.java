package lesson.second;

import java.util.Scanner;
/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class ifsum10and20tf {
    public static void main(String[] args) {
        int x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number a: ");
        x1 = scanner.nextInt();
        System.out.println("Insert some number b: ");
        x2 = scanner.nextInt();
        System.out.println(within10and20(x1,x2));
    }
    public static boolean within10and20(int x1, int x2) {
        int sum = x1+x2;
        System.out.println("Your sum: " + sum);
        return sum >= 10 && sum <= 20;
    }

}
