package HomeWork;

public class Dog extends Animal implements MovingAnimals{
    public Dog(int runDistance, int jumpDistance, int sailDistance) {
        super(runDistance, jumpDistance, sailDistance);
    }

    @Override
    public void run(int dist) {
        if (runDistance<dist){
            System.out.println("Слишком далеко");
        } else {
            System.out.println("Пес пробежал " + dist + " метров");
        }
    }

    @Override
    public void sail(int dist) {
        if (sailDistance<dist){
            System.out.println("Слишком далеко");
        } else {
            System.out.println("Пес проплыл " + dist + " метров");
        }
    }

    @Override
    public void jump(int dist) {
        if (jumpDistance<dist){
            System.out.println("Слишком высоко");
        } else {
            System.out.println("Пес прыгнул на " + dist + " метров");
        }
    }
}
