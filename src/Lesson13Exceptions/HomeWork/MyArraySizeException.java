package Lesson13Exceptions.HomeWork;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException(String s) {
        super(s);
    }
}
