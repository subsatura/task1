package lesson.sixth;

//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
public class Main {

    public static void main(String[] args) { // Ввод массива
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            int sum = sumArray(array); // Считаем сумму элементов массива там же проверка условий
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) { // Если не считается, то вывод причины
            System.out.println("Ошибка: " + e.getMessage()); // Возврат строки с сообщением об исключении
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException { // Проброс генерируемых исключений
            if (array.length != 4) { // Проверка размерности массива и запись ошибки в исключение
                throw new MyArraySizeException("Количество строк должно быть 4");
            }

            for (String[] row : array) {
                if (row.length != 4) {
                    throw new MyArraySizeException("Каждая строка должна содержать 4 элемента");
                }
            }
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // Проход по каждому элементу
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]); // Преобразование строкового представления числа в тип int
                } catch (NumberFormatException e) { // Исключение ошибки при попытке преобразования строки в число
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
