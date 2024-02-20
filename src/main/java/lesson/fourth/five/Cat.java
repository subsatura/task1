package lesson.fourth.five;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eat(Plate p) {
        if (p != null && p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            isHungry = false;
        } else {
            System.out.println("В тарелке недостаточно еды для кота " + name);
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }
}

