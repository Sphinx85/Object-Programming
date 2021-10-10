package HomeWork7;

public class Plate {
    int volume;
    int amountOfFood;

    public Plate(int volume, int amountOfFood) {
        this.volume = volume;
        this.amountOfFood = amountOfFood;
    }

    protected int giveRestOfFood(){
        return amountOfFood;
    }

    private void fillingWithFood(){
        amountOfFood = volume;
    }

}
