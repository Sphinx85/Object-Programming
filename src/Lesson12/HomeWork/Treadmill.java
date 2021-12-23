package Lesson12.HomeWork;

public class Treadmill extends Obstacles{
    private final int length;

    public int getLength() {
        return length;
    }

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void runAway(int distance, Players o) {
        String player = "";
        if (o.equals(new Human(10,10, 1))) player = "Человек";
        if (o.equals(new Cat(10,10, 1))) player = "Кот";
        if (o.equals(new Robo(10,10, 1))) player = "Робот";

        if (o.isPlayed()){
            if (this.length > distance){
                System.out.println(player + " " + o.getPlayerID() + " не может пробежать");
                o.setPlayed(false);
                System.out.println(player + " " + o.getPlayerID() + " покинул соревнования");
            } else System.out.println(player + " " + o.getPlayerID() + " пробежал");
        }

        /*if (o.isPlayed()) {
            System.out.println(this.length > distance ?
                    player + " " + o.getPlayerID() + " не может пробежать" :
                    player + " " + o.getPlayerID() + " пробежал");
        }
        if (this.length > distance){
            o.setPlayed(false);
            System.out.println(player + " " + o.getPlayerID() + " покинул соревнования");
        }*/
    }
}
