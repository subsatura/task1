package lesson.fourth.firstfour;

public class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        super(name, 200, 0); // Коты не умеют плавать, поэтому лимит плавания устанавливаем в 0
        count++;
    }

    public static int getCount() {
        return count;
    }
}
