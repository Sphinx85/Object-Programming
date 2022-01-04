package Lesson14Collections;

import java.util.HashMap;

public class DataBase {
    /**
     * Механика работы справочника
     */
    private Integer index = 0;
    private final HashMap<Integer, User> dataBase = new HashMap<>();
    /**
     * Метод добавления записей в базу
     */
    public void add(String name, Integer phoneNumber){
        dataBase.put(index,new User(name,phoneNumber));
        index++;
    }
    /**
     * Метод получения данных из базы по фамилии пользователя
     * дополнительный функционал будет помечен строчным комментрарием
     */
    public void get(String name){
        int bounds = 0; //Дополнительный счетчик
        for (int i = 0; i < dataBase.size(); i++) {
            if (!dataBase.get(i).getName().equals(name)) bounds++; //Проверка для отсутствующего пользователя
            if (dataBase.get(i).getName().equals(name)) {
                System.out.println(name + " номер телефона: " + dataBase.get(i).getPhoneNumber());
                bounds = -dataBase.size(); //Отсечка для счетчика, чтобы не попали действующие записи
            }
        }
        if (bounds > 0)System.out.println("Пользователя " + name + " нет в базе!"); //Сообщение дополнительного функционала
    }
}