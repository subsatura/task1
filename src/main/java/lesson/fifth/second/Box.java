package lesson.fifth.second;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {   // Метод добавления фрукта в коробку
        fruits.add(fruit);
    }

    public float getWeight() { // Метод вычисления веса коробки
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weight = 0.0F;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) { // Метод сравнения коробок по весу
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> anotherBox) {    // Метод пересыпания фруктов из текущей коробки в другую
        if (this == anotherBox) {
            return; // Нельзя пересыпать в саму себя
        }

        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear(); // Очищаем текущую коробку
    }
}
