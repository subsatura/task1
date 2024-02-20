package lesson.fourth.seven;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String openingTime, String closingTime, double cost) {
        Attraction attraction = new Attraction(name, openingTime, closingTime, cost);
        attractions.add(attraction);
    }

    public void displayAttractions() {
        System.out.println("Название места: " + name);
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    // Внутренний класс для хранения информации об аттракционе
    private class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private double cost;

        public Attraction(String name, String openingTime, String closingTime, double cost) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return name + " (С: " + openingTime + ", До: " + closingTime + ", Стоимость: " + cost + ")";
        }
    }
}