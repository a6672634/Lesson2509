package org.itstep.qa.geom.Lesson;

import java.util.Random;
// Напишите метод, увеличивающий элементы массива на 10%.
// Определите, какие у этого метода входные и выходные данные.
// Решите сами, должен ли метод изменять исходный массив, или в результате работы будет создаваться новый.
public class IncreaserArrayElements {

    public IncreaserArrayElements(){}

    public void increaseElements(int[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] += array[i] * 10 / 100;
    }

}
