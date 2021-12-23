package Lesson12.HomeWork;

public class RunRace {
    public static void main(String[] args) {
        Players [] players = new Players[15];
        Obstacles [] obstacles = new Obstacles[10];

        for (int i = 0; i< players.length; i=i+3){
            players[i] = new Human((int)(Math.random()*2),(int)(Math.random()*300), i);
            players[i+1] = new Cat((int)(Math.random()*4),(int)(Math.random()*600), i+1);
            players[i+2] = new Robo((int)(Math.random()*10),(int)(Math.random()*1200), i+2);
        }
        for (int i = 0; i< obstacles.length; i=i+2){
            obstacles[i] = new Wall((int)(Math.random()*7));
            obstacles[i+1] = new Treadmill((int)(Math.random()*1000));
        }

        /** Два варианта прохождения препятствий. Нужно поменять условия циклов и содержимое вложенного цикла фор
         * на закомментированное ниже
         */

        for (int  i=0; i < obstacles.length; i++){   // Здесь пишем players.length чтобы всю полосу препятствий проходили по очереди
            for (int j = 0; j < players.length; j++){   // Здесь пишем obstacles.length чтобы всю полосу препятствий проходили по очереди

                /**
                obstacles[j].jump(players[i].getJumpLimit(),players[i]); // раскомментировать этот код для другого варианта прохождения препятствий
                obstacles[j].runAway(players[i].getRunLimit(),players[i]);
                */

                obstacles[i].jump(players[j].getJumpLimit(),players[j]);      //Данный кусок
                obstacles[i].runAway(players[j].getRunLimit(),players[j]);      //Закомментировать
            }
        }
    }
}
