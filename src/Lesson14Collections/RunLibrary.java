package Lesson14Collections;

public class RunLibrary {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.add("Иванов", 5555555);
        dataBase.add("Петров", 5556985);
        dataBase.add("Весечкин", 5535155);
        dataBase.add("Иванов", 5515855);
        dataBase.add("Петров", 5582755);
        System.out.println("Иванов тел.: " + dataBase.get("Иванов"));
        System.out.println("Петров тел.: " + dataBase.get("Петров"));
        System.out.println(dataBase.get("Иванов"));
    }
}
