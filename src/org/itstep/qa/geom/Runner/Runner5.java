package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Lesson.Zadanie5;

public class Runner5 {
    public static void main(String[] args) {
        Zadanie5 s = new Zadanie5();
        int[] array = new int[10];
        s.initArray();
        s.printArray();
        s.increaseElements();
        System.out.println();
        s.printArray();
    }
}
