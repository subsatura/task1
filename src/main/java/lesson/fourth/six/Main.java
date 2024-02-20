package lesson.fourth.six;
//Создать класс Payment с внутренним классом,
//с помощью объектов которого можно сформировать покупку из
// нескольких товаров.
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Макароны", 499.99, 2);
        payment.addItem("Рис", 567.35, 1);
        payment.addItem("Греча", 1590.78, 3);
        payment.addItem("Курица", 3000, 1);
        System.out.println("Общая стоимость: " + payment.totalCost());
    }
}
