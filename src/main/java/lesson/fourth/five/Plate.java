package lesson.fourth.five;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.println("В тарелке недостаточно еды!");
        }
    }

    public int getFood() {
        return food;
    }

    public void addFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("Еда в тарелке: " + food);
    }
}
