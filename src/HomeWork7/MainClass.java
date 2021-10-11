package HomeWork7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat(0,0,0,12);
        Cat cat2 = new Cat(0,0,0,38);
        Cat cat3 = new Cat(0,0,0,16);
        Plate plate = new Plate(45);
        Plate plate1 = new Plate(23);
        Plate plate2 = new Plate(12);

        plate.fillingWithFood();
        plate.setAmountOfFood(cat1.catEat(cat1.appetite, plate.getAmountOfFood()));
        plate.setAmountOfFood(cat2.catEat(cat2.appetite, plate.getAmountOfFood()));
        plate.setAmountOfFood(cat3.catEat(cat3.appetite, plate.getAmountOfFood()));
    }
}
