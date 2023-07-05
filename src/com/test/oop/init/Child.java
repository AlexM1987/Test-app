package com.test.oop.init;

public class Child extends Parent {

    private int p;
    private static int pStatic;


    static {
        System.out.println("Child static block begins.");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println("Child static block ends.");
    }

    {
        System.out.println("Child non-static block begins.");
        System.out.println(p);
        pStatic = 123;
        System.out.println(p);
        System.out.println("Child non-static block ends.");
    }

    public Child(){
        System.out.println("Child constructor begins.");
        p = 123;
        System.out.println(p);
        System.out.println("Child constructor ends.");
    }

    public int getP() {
        return p;
    }

    public static int getpStatic() {
        return pStatic;
    }
}
