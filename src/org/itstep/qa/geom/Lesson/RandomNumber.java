package org.itstep.qa.geom.Lesson;

import java.util.Random;
//Создать метод, который будет принимать два целочисленных параметра a и b, будет возвращать случайное
// целое число из отрезка [a;b].
public class RandomNumber {

    public RandomNumber(){}

    public int random(int a, int b) {
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }
}
