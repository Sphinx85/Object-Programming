package Lesson14Collections;

import java.util.HashMap;

public class DataBase {

    private final HashMap<String, Integer> dataBase = new HashMap<>();



    public void add(String name, Integer number){
        dataBase.put(name,number);
    }

    public Integer get(String name){
        return dataBase.get(name);
    }
}
