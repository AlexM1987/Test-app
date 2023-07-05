package com.test;

public class ForTester {

    // 2 4 6 8 10 (1000 times)
    public static void task1(){
        for (int i = 0; i < 2000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 1 3 5 7 ... (500 times)
    public static void task2(){
        for (int i = 1; i < 1000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //10 20 30 40 50 ... (50 times)
    public static void task3(){
        for (int i = 0, number = 10; i < 50; i++) {
            System.out.print(number + " ");
            number = number + 10;
        }
        System.out.println();
    }

    //-1 -2 -3 -4 -5 ... (100 times)
    public static void task4(){
        for (int i = 0, number = -1; i < 100; i++) {
            System.out.print(number + " ");
            number = number - 1;
        }
        System.out.println();
    }

    //-1 2 -3 4 -5 ... (100 times)
    public static void task5(){
        for (int i = 0, number1 = -1, number2 = 2; i < 100; i++) {
            System.out.print(number1 + " ");
            System.out.print(number2 + " ");
            number1 = number1 - 2;
            number2 = number2 + 2;
        }
        System.out.println();
    }
    //-1 2 -3 4 -5 ... (100 times)
    public static void task5_1(){
        for (int i = 0, number = -1; i < 100; i++) {
           if(number % 2 == 0){
               System.out.print(((-1) * number) + " ");
           }else{
               System.out.print(number + " ");
           }
           number--;
        }
        System.out.println();
    }

    //random 0-10 (25 times)
    public static void task6() {
        for (int i = 0; i < 25; i++) {
            int x = (int) (Math.random() * 11);
            System.out.print(x + " ");
        }
    }

    // Таблица умножения
    public static void task7() {
        for (int a = 2; a <= 9; a++) {
            for (int b = 2; b <= 10; b++) {
                int result = a * b;
                System.out.println(a + " X " + b + " = " + result);
            }
            System.out.println("*********");
        }
    }

    // Раздача кристаликов
    public static void task8() {
        for (int num = 0; num < 9; num++) {
            int studentNumber = ((int) (Math.random() * 12) + 1);
            System.out.println(studentNumber);
        }
    }


    public static void main(String[] args) {
        //        0           1           3          2
        //for(<variable>;<condition>;<iteration>) {<body>}
        //<var> executes only 1 time
        //<condition> - true => body, false => loop termination
        //<iteration> - executes before each condition (right after body)
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        for (; true; ) {
//            System.out.println("Inside FOR");
//            int x = (int) (Math.random() * 10);
//            if (x == 5) {
//                break;// leave for loop
//            }
//        }

        // %
//        int number1 = 3;
//        int number2 = 2;
//
//        int result = number1 % number2;
//        System.out.println(result);

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task5_1();
        //task6();
        //task7();
        //task8();
    }

}