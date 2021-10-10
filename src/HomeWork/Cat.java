package HomeWork;

public class Cat extends Animal implements MovingAnimals{

    int appetite;
    boolean satiety;


    public Cat(int runDistance, int jumpDistance, int sailDistance) {
        super(runDistance, jumpDistance, sailDistance);

    }

    @Override
    public void run(int dist) {
        if (runDistance<dist){
            System.out.println("Слишком далеко");
        } else {
            System.out.println("Кот пробежал " + dist + " метров");
        }
    }

    @Override
    public void sail(int dist) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void jump(int dist) {
        if (jumpDistance<dist){
            System.out.println("Слишком высоко");
        } else {
            System.out.println("Кот прыгнул на " + dist + " метров");
        }
    }
}
