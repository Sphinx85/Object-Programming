package HomeWork7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat(0,0,0,12);
        Plate plate = new Plate(45,0);

        cat1.catEat(cat1.appetite, plate.giveRestOfFood());
    }
}
