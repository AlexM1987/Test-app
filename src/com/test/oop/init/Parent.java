package com.test.oop.init;

public class Parent {

    private int p;
    private static int pStatic;


    static {
        System.out.println("Parent static block begins.");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println("Parent static block ends.");
    }

    {
        System.out.println("Parent non-static block begins.");
        System.out.println(p);
        pStatic = 123;
        System.out.println(p);
        System.out.println("Parent non-static block ends.");
    }

    public Parent(){
        System.out.println("Parent constructor begins.");
        p = 123;
        System.out.println(p);
        System.out.println("Parent constructor ends.");
    }

    public int getP() {
        return p;
    }

    public static int getpStatic() {
        return pStatic;
    }
}
