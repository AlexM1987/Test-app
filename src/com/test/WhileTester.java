package com.test;

import java.util.Scanner;

public class WhileTester {
    public static void main(String[] args) throws InterruptedException {
//        int t = 23;
//        final int max = 100;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How much water do you want?");
//        int ml = sc.nextInt();
//        if (ml >= 200 && ml <= 5000){
//        while (t <= 100) {
//            System.out.println("Boiling...");
//            Thread.sleep(500 * (ml/1000));
//            int x = (int) (Math.random() * 6) + 5; //from 5 to 10
//            t += x; // t = t + x;
//            System.out.println("Current tmp is " + t);
//        }
//        } else {
//            System.out.println("Volume should be between 0.2l and 5l");
//        }
//    }
        task1();
    }

    // Раздача кристаликов
    public static void task1() {
        int num = 0;
        while (num < 10) {
            int studentNumber = ((int) (Math.random() * 13) + 1);
            System.out.println(studentNumber);
            num += 1; //num++
        }
    }
}
