package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Lesson.IncreaserArrayElements;

import java.util.Random;

public class RunnerIncreaserArrayElements {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        IncreaserArrayElements increaser = new IncreaserArrayElements();
        increaser.increaseElements(array);
        System.out.println();
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}
