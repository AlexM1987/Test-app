package com.test.oop.init;

public class Third extends Child {

    private int p;
    private static int pStatic;


    static {
        System.out.println("Third static block begins.");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println("Third static block ends.");
    }

    {
        System.out.println("Third non-static block begins.");
        System.out.println(p);
        pStatic = 123;
        System.out.println(p);
        System.out.println("Third non-static block ends.");
    }

    public Third(){
        System.out.println("Third constructor begins.");
        p = 123;
        System.out.println(p);
        System.out.println("Third constructor ends.");
    }

    public int getP() {
        return p;
    }

    public static int getpStatic() {
        return pStatic;
    }
}
