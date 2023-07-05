package com.test;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args) {
//        int num = 1;
//        // switch (var) {body with cases}
//
//        switch (num) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            default:
//                System.out.println("Neither ONE nor TWO");
//        }


//        System.out.println("1. Monday");
//        System.out.println("2. Tuesday");
//        System.out.println("3. Wednesday");
//        System.out.println("4. Thursday");
//        System.out.println("5. Friday");
//        System.out.println("6. Saturday");
//        System.out.println("7. Sunday");
//
//        System.out.println("Input number of a day:");
//        Scanner sc = new Scanner(System.in);
//        int dayNumber = sc.nextInt();

//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Only numbers from 1 to 7 are acceptable!");
  //      }
          task2();
    }
    public static void task1() {
        System.out.println("Input month number:");
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall.");
                break;
            default:
                System.out.println("Only numbers from 1 to 12 are acceptable!");
        }
    }

    public static void task2() {
        System.out.println("Input one letter:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int code = (int)ch; //получаем код символа
        System.out.println("Code is " + code);
        if (Character.isLetter(ch)) { //(code >= 65 && code <= 90) || (code >= 97 && code <= 122)
            System.out.println("Correct! It is a letter!");
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                case 'y':
                    System.out.println("It's a vowel.");
                    break;
                default:
                    System.out.println("It's a consonant.");
                    break;
            }
        } else {
            System.out.println("Ouch!.. It is not a letter!");
        }


    }
}
