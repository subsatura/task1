package lesson.fourth.firstfour;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//4. * Добавить подсчет созданных котов, собак и животных.
//

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(150);
        dogBobik.swim(5);
        catBarsik.run(150);
        catBarsik.swim(5);

        System.out.println("Всего создано собак: " + Dog.getCount());
        System.out.println("Всего создано котов: " + Cat.getCount());
        System.out.println("Всего создано животных: " + Animal.getCount());
    }
}