package com.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My name is Alex");
        System.out.print("Current t = -2\n");
        System.out.print("Tomorrow t = -6\n");

        // variable declaration - создание переменной
        // <type> <var_name>;
        int temp;
        double avg;

        //variable initialisation - ввод данный в переменную
        //<var_name> = <value>;
        temp = -2;
        avg = 9.5;

        // variable declaration & variable initialisation in a single line
        //<type> <var_name> = <value>;
        int age = 35;
        int height = 185;

        System.out.println(temp);

        int tempTom = -6;
        System.out.println("Tomorrow the temperature is " + tempTom);

        // <type> <var_name> = <value>, ...;
        int a = 15, b = 30;

        int math = 8, biology = 7, literature = 10, physics = 9;
        System.out.println("My math mark is " + math + ", " + "My biology mark is " + biology + ", "
                + "My literature mark is " + literature + ", " + "My physics mark is " + physics + ".");


    }
}
