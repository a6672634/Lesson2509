package org.itstep.qa.geom.Lesson;

import java.util.Random;
//Создать метод, который будет принимать два целочисленных параметра a и b, будет возвращать случайное
// целое число из отрезка [a;b].
public class Zadanie4 {
    public static int random(int a, int b) {
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }
}
