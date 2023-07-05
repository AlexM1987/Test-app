package com.test.oop.casting;

public class Rectangle extends Shape {

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this(a, a);
    }



    @Override
    public void print() {
        System.out.println(" __________");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println(" ----------");
    }

    @Override
    public void calculateP() {
        setP(2 * (a + b));
    }

    @Override
    public void calculateS() {
        setS(a * b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
