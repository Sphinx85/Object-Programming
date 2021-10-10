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
    public boolean catEat(int appetite, int amountOfFood) {
        return appetite <= amountOfFood;
    }
}
