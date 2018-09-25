package org.itstep.qa.geom;

public class Treugolnik {
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getMultiple( double a, double b, double c){
    //сдесь может быть еще куча строк кода
        return a*b*c;
    }
    public double getMultiple( double a, double b){
        //сдесь может быть еще куча строк кода
        return a*b;
    }
    public double getMultiple( int a, double b, double c){
        //сдесь может быть еще куча строк кода
        return a*b*c;
    }
    private void printHello(){
        System.out.println("Hello");
    }

}
