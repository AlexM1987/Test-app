package com.test;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Begin main.");
        System.out.println("Main method logic.");
        runTusk();
    //    task1();// run method
    //    task2();
    //    task3rect();
    //    task4triangle();
    //    task5circle();
        System.out.println("Main END");
    }

    public static void task1(){
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End of method.");
    }

    public static void task2(){
        System.out.println("Task 2 begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        System.out.println("Input c:");
        int c = sc.nextInt();

        System.out.println("Result: D= " + a+"*x*x + " + b+"+x + " + c + " = 0");

     //   Math.sqrt(9);
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println(Math.sqrt(9));
        System.out.println("D is " + d);
        if (d > 0){
            System.out.println("2 results");
            double x1, x2;
            x1 = (- b + Math.sqrt(d))/(2 * a);
            x2 = (- b - Math.sqrt(d))/(2 * a);
            System.out.println("X1 is " + x1);
            System.out.println("X2 is " + x2);
        }else  if(d == 0){
            System.out.println("single result");
            double x1;
            x1 = - b / (2 * a);
            System.out.println("X1 is " + x1);
        }else {
            System.out.println("No roots");
        }

    }
    public static void task3rect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        System.out.println("a = " + a + ", b = " + b + ".");

        if (a == b){
            System.out.println("The rectangle is a square!");
        }
        int p = 2 * a + 2 * b;
        int s = a * b;
        System.out.println("Perimeter is " + p);
        System.out.println("Square is " + s);
    }

    public static void task4triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        System.out.println("Input c:");
        int c = sc.nextInt();
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        if ((a + b) <= c){
            System.out.println("Building a triangle is impossible.");
        } else if ((a + c) <= b) {
            System.out.println("Building a triangle is impossible.");
        } else if ((b + c) <= a) {
            System.out.println("Building a triangle is impossible.");
        } else {
            System.out.println("Building a triangle is POSSIBLE!");
        }
        double p = (a + b + c) / 2.0;
        System.out.println("p = " + p);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("S = " + s);


        if (a == b || b == c || a == c){
            System.out.println("This triangle is isosceles!");
        }
        if (a == b && b == c){
            System.out.println("This triangle is even equilateral!");
        }

    }

    public static void task5circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input r:");
        int r = sc.nextInt();
        double s = 3.14 * r * r;
        double l = 2 * 3.14 * r;
        System.out.println("R = " + r + ", S = " + s + ", L = " + l);
    }

    public static void runTusk(){
        System.out.println("1.task1()");
        System.out.println("2.task2()");
        System.out.println("3.task3rect()");
        System.out.println("4.task4triangle()");
        System.out.println("5.task5circle()");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num: ");
        int num = sc.nextInt();

        if(num == 1){
            task1();
        }else if (num == 2){
            task2();
        }else if (num == 3){
            task3rect();
        }else if (num == 4){
            task4triangle();
        }else if (num == 5){
            task5circle();
        }else {
            System.out.println("Wrong input!");
        }
    }




}
