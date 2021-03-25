package ru.geekbrains.homework6;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(65);
        Cat[] cats = {
                new Cat("Markiz", 15),
                new Cat("Musya", 10),
                new Cat("Proglot", 20),
                new Cat("Objora", 30),
        };
        plate.putFood(10);
        System.out.println("На начало трапезы в тарелке " + plate.getFood() + " еды");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.isSatiety());    //Поленился сделать более красивый вывод из-за нехватки времени
        }
    }
}
