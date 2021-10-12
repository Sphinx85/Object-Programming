package HomeWork7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        Cat cat1 = new Cat(0,0,0,12);
        Cat cat2 = new Cat(0,0,0,38);
        Cat cat3 = new Cat(0,0,0,16);

        Plate plate1 = new Plate(random.nextInt(100));
        plate1.setAmountOfFood(cat1.catEat(cat1.appetite, plate1.getAmountOfFood()));

        Plate plate2 = new Plate(random.nextInt(100));
        plate2.setAmountOfFood(cat2.catEat(cat2.appetite, plate2.getAmountOfFood()));

        Plate plate3 = new Plate(random.nextInt(100));
        plate3.setAmountOfFood(cat3.catEat(cat3.appetite, plate3.getAmountOfFood()));

        System.out.println("_______________________________________________________________");

        Plate plate = new Plate(random.nextInt(100));

        Cat [] catArray = new Cat[random.nextInt(100)];
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat(i,i,i, random.nextInt(50+i));
        }

        for (Cat cat : catArray) {
            if (cat.appetite > plate.getAmountOfFood()){
                plate.fillingWithFood();
            }
            plate.setAmountOfFood(cat.catEat(cat.appetite,plate.getAmountOfFood()));
        }

        System.out.println("_______________________________________________________________");

        Cat [] catArray2 = new Cat[9];
        for (int i = 0; i < catArray2.length; i++) {
            catArray[i] = new Cat(i,i,i, random.nextInt(50+i),false);
        }




    }
}
