package Lesson12.HomeWork;

public class Wall extends Obstacles{
    private final int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void jump(int distance, Players o) {
        String player = "";
        if (o.equals(new Human(10,10, 1))) player = "Человек";
        if (o.equals(new Cat(10,10, 1))) player = "Кот";
        if (o.equals(new Robo(10,10, 1))) player = "Робот";

        if (o.isPlayed()){
            if (this.height > distance){
                System.out.println(player + " " + o.getPlayerID() + " не может перепрыгнуть");
                o.setPlayed(false);
                System.out.println(player + " " + o.getPlayerID() + " покинул соревнования");
            } else System.out.println(player + " " + o.getPlayerID() + " перепрыгнул");
        }




        /*if (o.isPlayed()) {
            System.out.println(this.height > distance ?
                    player + " " + o.getPlayerID() + " не может перепрыгнуть" :
                    player + " " + o.getPlayerID() + " перепрыгнул");
        }
        if (this.height > distance){
            o.setPlayed(false);
            System.out.println(player + " " + o.getPlayerID() + " покинул соревнования");
        }*/
    }


}
