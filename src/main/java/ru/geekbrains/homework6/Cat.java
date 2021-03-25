package ru.geekbrains.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            System.out.println("В тарелке ещё осталось " + plate.getFood() + " еды");
            return satiety = true;
        }
        System.out.println("В тарелке мало еды!");
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
