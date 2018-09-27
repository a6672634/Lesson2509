package org.itstep.qa.geom.Lesson;

import java.util.Random;
// Напишите метод, увеличивающий элементы массива на 10%.
// Определите, какие у этого метода входные и выходные данные.
// Решите сами, должен ли метод изменять исходный массив, или в результате работы будет создаваться новый.
public class Zadanie5 {
    private static int[] increaseElements(int[] array)
    {
        for(int i = 0; i < array.length; i++)
            array[i] += array[i] * 10 / 100;
        return array;
    }

    private static void initArray(int[] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(50);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public void printArray() {

    }

    public void increaseElements() {

    }

    public void initArray() {

    }
}
