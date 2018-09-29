package org.itstep.qa.geom.Lesson;

public class Circle {
    private double radius;

    public Circle(){
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
