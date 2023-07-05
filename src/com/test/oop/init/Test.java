package com.test.oop.init;

public class Test {

    static {
        System.out.println("Test static block.");
    }

    Test(){
        System.out.println("Test constructor.");
    }
    public static void main(String[] args) {
        new Test();
        new Third();

        double pi = Math.PI;
    }
}
