package Lesson16MultiThread;

import java.util.Arrays;

public class MainRun  extends Thread{
    /**
     * Задаем переменные, которые будут всегда использоваться.
     */
    public static final int size = (int) (Math.random() * 10000000);
    public static final int halfSize = size/2;

    /**
     * Класс, запускающий первый метод в отдельном потоке
     */
    public static class MethodOne extends MainRun implements Runnable{

        @Override
        public void run() {
            methodOne();
        }
    }

    /**
     * Класс, запускающий второй метод в отдельном потоке
     */
    public static class MethodTwo extends MainRun implements Runnable{

        @Override
        public void run() {
            methodTwo();
        }
    }

    /**
     * Класс для запуска пересчета массива в потоке
     */
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

    /**
     * Класс для склейки массивов в потоке
     */
    public static class ArrayConnect extends Thread{
        Float[] half1;
        Float[] half2;

        public ArrayConnect(Float[] half1, Float[] half2) {
            this.half1 = half1;
            this.half2 = half2;
        }

        @Override
        public void run() {
            arrayConnect(half1,half2);
        }
    }

    public static void main(String[] args) {
        new Thread(new MethodOne()).start();
        new Thread(new MethodTwo()).start();
    }
    /**
     * Метод первый
     * вычисляет новые значения ячеек
     */
    public static void methodOne(){
        Float[] array = new Float[size];
        arrayFully(array);
        long before = System.currentTimeMillis();
        arrayCalculator(array);
        System.out.println("Время пересчета ячеек первым методом: " + (System.currentTimeMillis() - before));
    }
    /**
     * Метод второй
     * разбивает массив на два массива, в двух потоках высчитывает новые значения
     * и потом склеивает эти массивы обратно в один.
     */
    public static void methodTwo(){
        Float[] array = new Float[size];
        Float[] halfArrayOne = new Float[halfSize];
        Float[] halfArrayTwo = new Float[halfSize];
        arrayFully(array);
        long before = System.currentTimeMillis();
        arrayDivision(array,halfArrayOne,halfArrayTwo);
        Thread calculateOne = new Thread(new CalculateArrayThread(halfArrayOne));
        Thread calculateTwo = new Thread(new CalculateArrayThread(halfArrayTwo));
        calculateOne.start();
        calculateTwo.start();
        Thread connectArrays = new Thread(new ArrayConnect(halfArrayOne,halfArrayTwo));
        while (true){
            if (!(calculateOne.isAlive() || calculateTwo.isAlive())){
                connectArrays.start();
                break;
            }
        }
        while (true){
            if (!connectArrays.isAlive()){
                System.out.println("Время пересчета ячеек вторым методом: " + (System.currentTimeMillis() - before));
                break;
            }
        }
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
    public static void arrayDivision(Float[] array, Float[] halfArrayOne, Float[] halfArrayTwo){
        long before = System.currentTimeMillis();
        System.arraycopy(array,0, halfArrayOne,0,halfSize);
        System.arraycopy(array,halfSize, halfArrayTwo,0,halfSize);
        System.out.println("Время разбивки массива: " + (System.currentTimeMillis() - before));
    }
    /**
     * Метод склейки массивов
     */
    public static void arrayConnect(Float[] half1, Float[] half2){
        long before = System.currentTimeMillis();
        Float[] array = new Float[size];
        System.arraycopy(half1,0,array,0,halfSize);
        System.arraycopy(half2,0,array,halfSize,halfSize);
        System.out.println("Время склейки массива вторым методом: " + (System.currentTimeMillis() - before));
    }
    /**
     * Метод заполнения массива
     */
    public static void arrayFully(Float[] array){
        Arrays.fill(array, 99f);
    }
}
