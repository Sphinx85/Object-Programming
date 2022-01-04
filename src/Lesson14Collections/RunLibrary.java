package Lesson14Collections;

public class RunLibrary {
    public static void main(String[] args) {
        /**
         * Создаем базу данных
         */
        DataBase dataBase = new DataBase();
        /**
         * Закидываем в базу пользователей
         */
        dataBase.add("Иванов",5555555);
        dataBase.add("Петров",5556985);
        dataBase.add("Васечкин",5535155);
        dataBase.add("Иванов",5515855);
        dataBase.add("Петров",5582755);
        dataBase.add("Иванов", 9995588);
        /**
         * Получаем данные из базы
         */
        dataBase.get("Иванов");
        dataBase.get("Петров");
        dataBase.get("Уварова"); //Проверка отсутствующей записи в базе
    }
}