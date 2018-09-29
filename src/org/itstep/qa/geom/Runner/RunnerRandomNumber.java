package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Lesson.RandomNumber;

public class RunnerRandomNumber {
    public static void main(String[] args) {
        RandomNumber number = new RandomNumber();
        System.out.println(number.random(9,10));
    }
}
