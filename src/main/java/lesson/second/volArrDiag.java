package lesson.second;

/*
8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
public class volArrDiag {
    public static void main(String[] args) {
        int size = 7; // Размер квадратного массива
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;             // Основная диагональ
            array[i][size - 1 - i] = 1;  // Побочная диагональ
        }
        printArray(array);
    }

    // Метод для вывода двумерного массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

