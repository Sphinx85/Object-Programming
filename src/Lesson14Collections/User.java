package Lesson14Collections;

public class User {

    /**
     * Класс пользователя
     */
    private final String name;
    private final Integer phoneNumber;

    public User(String name, Integer phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }
}