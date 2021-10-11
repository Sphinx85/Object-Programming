package HomeWork7;

public class Plate {
    int volume;
    int amountOfFood;

    public Plate(int volume) {
        this.volume = volume;
        this.amountOfFood = fillingWithFood();
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
        System.out.println("В миске осталось " + amountOfFood + " еды.");
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public int fillingWithFood(){
        amountOfFood = volume;
        System.out.println("Миска наполнена, объем еды " + volume);
        return amountOfFood;
    }

}
