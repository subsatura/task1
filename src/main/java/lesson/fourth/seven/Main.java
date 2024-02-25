package lesson.fourth.seven;

public class Main {
    public static void main(String[] args) {
        Park park = new Park("Парк Культуры имени Крупской 50 летия Октября Ордена им. В.И. Ленина");

        park.addAttraction("Солнышко", "10:00", "20:00", 250);
        park.addAttraction("Юнга", "11:00", "21:00", 150);
        park.addAttraction("Фрегат", "9:30", "19:30", 1000);
        park.addAttraction("Сюрприз", "10:30", "20:30", 700);
        park.displayAttractions();
    }
}
