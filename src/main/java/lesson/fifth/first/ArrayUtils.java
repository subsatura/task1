package lesson.fifth.first;

public class ArrayUtils {
    public static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        if (array == null || firstIndex < 0 || firstIndex >= array.length || secondIndex < 0 || secondIndex >= array.length) {
            // Вывод сообщения об ошибке в консоль
            System.err.println("Неверно указаны элементы массива");
            return; // Просто выходим из метода
        }

        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
