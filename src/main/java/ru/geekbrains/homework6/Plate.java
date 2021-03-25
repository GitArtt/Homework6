package ru.geekbrains.homework6;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось " + food + " еды");
    }

    public void decreaseFood(int n) {
        if(n <= food) {
            food -= n;
        }
    }

    public int getFood() {
        return food;
    }

    public void putFood(int food) {
        this.food += food;
    }
}
