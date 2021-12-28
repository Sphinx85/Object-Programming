package Lesson13Exceptions.HomeWork;

import java.util.Arrays;

public class RunException {
    public static void main(String[] args) {
        String [][]array1 = new String[4][4];
        String [][]array2 = new String[4][7];
        run(array1);
        run(array2);
    }

    private static void run(String[][] array) {
        try {
            if (!Arrays.deepEquals(array, new String[4][4])){
                throw new MyArraySizeException("Не верный размер массива");
            }
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    array[i][j] = "14";
                }
            }
            array[2][1] = "A";
            System.out.println("Массив задан верно");

            int arraySumm = 0;
            Integer [][] intArray = new Integer[4][4];
            for (int i = 0; i<array.length; i++){
                for (int j = 0; j< array.length; j++){
                    try {
                        if (array[i][j].contains("A")){
                            throw new MyArrayDataException("Не верный формат данных");
                        }
                        intArray[i][j] = Integer.parseInt(array[i][j]);
                        arraySumm = arraySumm + intArray[i][j];
                    } catch (MyArrayDataException e){
                        System.out.println("Не верный аргумент для преобразования в ячейке " + i + " " + j);
                    }
                }
            }
            System.out.println("Результат расчета: " + arraySumm);
        } catch (MyArraySizeException e){
            System.out.println("Вы задали не верные параметры массива, расчет не будет произведен");
        }
    }
}
