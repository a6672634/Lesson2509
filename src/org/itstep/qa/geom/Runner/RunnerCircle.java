package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Lesson.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("Length = " + circle.getLength());
    }
}
