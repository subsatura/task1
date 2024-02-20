package lesson.fourth.six;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items;

    public Payment() {
        items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
        double totalCost = price * quantity;
        System.out.println("Добавлен товар: " + name + ", Цена: " + price + ", Количество: " + quantity + ", Итог: " + totalCost);
    }

    public double totalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public Iterable<? extends Item> getItems() {
        return items;
    }

    public class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getName() {
            return name;
        }
    }
}
