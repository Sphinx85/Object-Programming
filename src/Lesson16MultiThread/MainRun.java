package Lesson16MultiThread;

import java.util.Arrays;

public class MainRun {
    /**
     * Задаем переменные, которые будут всегда исползоваться.
     */
    public static final int size = (int) (Math.random() * 10000000);
    public static final int halfSize = size/2;
    public static Float [] halfArrayOne = new Float[halfSize];
    public static Float [] halfArrayTwo = new Float[halfSize];
    public static Float[] mainArray = new Float[size];

    public static class MethodOne extends MainRun implements Runnable{

        @Override
        public void run() {
            methodOne(mainArray);
        }
    }

    public static class MethodTwo extends MainRun implements Runnable{

        @Override
        public void run() {
            methodTwo(mainArray);
        }
    }

    public static class CalculateArrayThread extends MainRun implements Runnable{

        private final Float[] half;

        public CalculateArrayThread(Float[] half) {
            this.half = half;
        }

        @Override
        public synchronized void run() {
            long before = System.currentTimeMillis();
            arrayCalculator(half);
            System.out.println("Время пересчета массива в отдельном потоке: " + (System.currentTimeMillis() - before));
        }
    }

    /*public static class ArrayConnect implements Runnable{
        Float[] half1;
        Float[] half2;

        public ArrayConnect(Float[] half1, Float[] half2) {
            this.half1 = half1;
            this.half2 = half2;
        }

        @Override
        public synchronized void run() {
            mainArray = arrayConnect(half1,half2);
        }
    }*/

    public static void main(String[] args) {
        arrayFully(mainArray);
        new Thread(new MethodOne()).start();
        new Thread(new MethodTwo()).start();
    }
    /**
     * Метод первый
     * Вычисляет новые значения ячеек
     */
    public static void methodOne(Float[] array){
        long before = System.currentTimeMillis();
        arrayCalculator(array);
        System.out.println("Время пересчета ячеек первым методом: " + (System.currentTimeMillis() - before));
    }
    /**
     * Метод второй
     * Разбивает массив на два массива, в двух потоках высчитывает новые значения
     * и потом склеивает эти массивы обратно в один.
     */
    public static void methodTwo(Float [] array){
        arrayDivision(array);
        new Thread(new CalculateArrayThread(halfArrayOne)).start();
        new Thread(new CalculateArrayThread(halfArrayTwo)).start();
        mainArray = arrayConnect(halfArrayOne,halfArrayTwo);
    }
    /**
     * Метод подсчета значений
     */
    public static void arrayCalculator(Float[] array){
        for (float i = 0; i < array.length; i++) {
            array[(int) i] = (float) (array[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    /**
     * Медод разделения массива на два
     */
    public static void arrayDivision(Float[] array){
        long before = System.currentTimeMillis();
        System.arraycopy(array,0, halfArrayOne,0,halfSize);
        System.arraycopy(array,halfSize, halfArrayTwo,0,halfSize);
        System.out.println("Время разбивки массива: " + (System.currentTimeMillis() - before));
    }
    /**
     * Метод склейки массивов
     */
    public static Float[] arrayConnect(Float[] half1, Float[] half2){
        long before = System.currentTimeMillis();
        Float[] array = new Float[size];
        System.arraycopy(half1,0,array,0,halfSize);
        System.arraycopy(half2,0,array,halfSize,halfSize);
        System.out.println("Время склейки массива вторым методом: " + (System.currentTimeMillis() - before));
        return array;
    }
    /**
     * Метод заполнения массива
     */
    public static void arrayFully(Float[] array){
        Arrays.fill(array, 99f);
    }
}
