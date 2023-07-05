package com.test;

import java.util.Scanner;

public class Calculator {

    public static void printSumma(int a, int b) {
          System.out.println("S = " + (a + b));
    }

    public static void printX2 (int a) {
        System.out.println("X2 = " + (a * 2));
    }
          public static int summa (int a, int b) {
              int result = a + b;
              return result;
         }

        public static int sub (int a, int b){
        int result = a - b;
        return result;
         }

         public static double div (double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Div by Zero");
        }
             double result = a / b;
             return result;
         }

    public static int mul (int a, int b){
        int result = a * b;
        return result;
    }

    public static int sqrt (int base){
        int result = (int) Math.sqrt(base);
        return result;
    }

    public static int distance(int v, int t){
        int result = v * t;
        return result;
    }

    public static double pithagoras (double a, double b){
        int c = (int) Math.sqrt(((a * a) + (b * b)));
        return c;
    }

    public static void randomMethod(int times){
        if (times < 1){
            System.out.println("Wrong number!");
        }else {
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < times; i++){
                int mNum = (int) Math.random() * 6 + 1;
                switch (mNum){
                    case 1:
                    {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        int r = summa(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        int r = sub(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Input A(double):");
                        double a = sc.nextDouble();
                        System.out.println("Input B(double):");
                        double b = sc.nextDouble();
                        double r = div(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        int r = mul(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Input number:");
                        int a = sc.nextInt();
                        double r = sqrt(a);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Input A(double):");
                        double a = sc.nextDouble();
                        System.out.println("Input B(double):");
                        double b = sc.nextDouble();
                        double r = pithagoras(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    default:
                    {
                        System.out.println("Incorrect input!");
                        System.out.println("1. Try again.");
                        System.out.println("2. Cancel program.");
                        System.out.println("Make your decision:");
                        int methodNumber1 = sc.nextInt();
                        switch (methodNumber1){
                            case 1:
                            {
                                menu();
                            }
                            case 2:
                            {
                                break;
                            }
                        }
                    }
                }

            }
        }


    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Amount.");
        System.out.println("2. Subtraction.");
        System.out.println("3. Division.");
        System.out.println("4. Multiplication.");
        System.out.println("5. Square root.");
        System.out.println("6. Pithagoras.");
        System.out.println("Your decision:");

        int methodNumber = sc.nextInt();
        switch (methodNumber){
            case 1:
            {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 2:
            {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                int r = sub(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 3:
            {
                System.out.println("Input A(double):");
                double a = sc.nextDouble();
                System.out.println("Input B(double):");
                double b = sc.nextDouble();
                double r = div(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 4:
            {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                int r = mul(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 5:
            {
                System.out.println("Input number:");
                int a = sc.nextInt();
                double r = sqrt(a);
                System.out.println("Result is " + r);
                break;
            }
            case 6:
            {
                System.out.println("Input A(double):");
                double a = sc.nextDouble();
                System.out.println("Input B(double):");
                double b = sc.nextDouble();
                double r = pithagoras(a, b);
                System.out.println("Result is " + r);
                break;
            }
            default:
            {
                System.out.println("Incorrect input!");
                System.out.println("1. Try again.");
                System.out.println("2. Cancel program.");
                System.out.println("Make your decision:");
                int methodNumber1 = sc.nextInt();
                switch (methodNumber1){
                    case 1:
                    {
                        menu();
                    }
                    case 2:
                    {
                        break;
                    }
                }
            }
        }
    }

    // Client (it executes methods)
    public static void main(String[] args) {
//       //printSumma(Integer.MAX_VALUE, -60);
//        printSumma(10, -60);
//        //printX2(200);
//        int s = summa(10, 20);
//        System.out.println(s);
//
//        int r = sub(200, -200);
//        System.out.println("Sub result is " + r);
//
//        double d = div(5.0, 1);
//        System.out.println("Division result is " + d);
//
//        int m = mul(2, 2);
//        System.out.println("Multiplication result is " + m);
//
//        System.out.println(sub(sub(2,2), summa(4, 4)));
//
//        System.out.println(sqrt(9));
//
//        System.out.println("The distance is " + distance(5, 5));
//
//        double c = pithagoras(3, 4);
//        System.out.println("c = " + c);
      //menu();
        randomMethod(6);
    }

}

