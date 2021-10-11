package HomeWork7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        /*Cat cat1 = new Cat(0,0,0,12);
        Cat cat2 = new Cat(0,0,0,38);
        Cat cat3 = new Cat(0,0,0,16);*/
        Plate plate = new Plate(45);
        /*Plate plate1 = new Plate(23);
        Plate plate2 = new Plate(12);*/

        Cat [] catArray = new Cat[5];
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat(i,i,i, random.nextInt(50+i));
        }

        for (Cat cat : catArray) {
            if (cat.appetite> plate.getAmountOfFood()){
                plate.fillingWithFood();
            }
            plate.setAmountOfFood(cat.catEat(cat.appetite,plate.getAmountOfFood()));
        }

        /*plate.fillingWithFood();
        plate.setAmountOfFood(cat1.catEat(cat1.appetite, plate.getAmountOfFood()));
        plate.setAmountOfFood(cat2.catEat(cat2.appetite, plate1.getAmountOfFood()));
        plate.setAmountOfFood(cat3.catEat(cat3.appetite, plate2.getAmountOfFood()));*/
    }
}
