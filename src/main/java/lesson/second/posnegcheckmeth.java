package lesson.second;

import java.util.Scanner;
/*
3. Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное,
и вернуть false если положительное. Замечание: ноль считаем положительным числом.
 */

public class posnegcheckmeth {
    public static void main(String[] args) {
        int x1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number: ");
        x1 = scanner.nextInt();
        System.out.println(posneg(x1));
    }
    public static boolean posneg(int x) {
        return x < 0;
    }

}
