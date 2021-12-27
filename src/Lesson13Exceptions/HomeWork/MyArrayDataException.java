package Lesson13Exceptions.HomeWork;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
    }

    public MyArrayDataException(String s) {
        super(s);
    }
}
