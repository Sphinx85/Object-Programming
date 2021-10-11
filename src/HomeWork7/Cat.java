package HomeWork7;

import HomeWork.Animal;

public class Cat extends Animal implements CatEating{
    int appetite;
    boolean satiety;

    public Cat(int runDistance, int jumpDistance, int sailDistance, int appetite) {
        super(runDistance, jumpDistance, sailDistance);
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    public int catEat(int appetite, int satiety) {
        if (appetite <= satiety){
            System.out.println("Кот поел");
            return satiety - appetite;
        } else {
            System.out.println("Коту не хватило пищи");
            return satiety;
        }
    }
}
