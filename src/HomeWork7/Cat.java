package HomeWork7;

import HomeWork.Animal;

public class Cat extends Animal implements CatEating{
    int appetite;
    boolean satiety;
    boolean masterPlate;
    long timeBefore;
    long timeAfter;

    public Cat(int runDistance, int jumpDistance, int sailDistance, int appetite) {
        super(runDistance, jumpDistance, sailDistance);
        this.appetite = appetite;
        this.satiety = false;
    }

    public Cat(int runDistance, int jumpDistance, int sailDistance, int appetite, boolean masterPlate) {
        super(runDistance, jumpDistance, sailDistance);
        this.appetite = appetite;
        this.masterPlate = masterPlate;
    }

    boolean plateMaster(boolean masterPlate){
        if (masterPlate){
            System.out.println("Кот спокойно кушает");
            return true;
        } else {
            System.out.println("Получил по морде от хозяина миски");
            return false;
        }
    }

    @Override
    public int catEat(int appetite, int satiety) {
        timeBefore = System.currentTimeMillis();
        return 0;
    }
}
