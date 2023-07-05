package com.test;

public class IfTester {

    public static void main(String[] args) {
        System.out.println("Begin.");

        int t = -30;
        //if(<condition>) {<body>}, where condition can be TRUE or FALSE!
        //if condition TRUE -> BODY
        if(t > 20) {
            System.out.println("Put on a T-shirt.");
        }

        if(t < -15) {
            System.out.println("Put on a coat.");
        }

        int m1 = 10, m2 = 10, m3 = 9, m4 = 5, m5 =10;
        double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
        System.out.println("avg = " + avg);

        if(avg >= 9){
            System.out.println("Excellent student!");
        } else if(avg >= 6) {
            System.out.println("Good student.");
        } else {
            System.out.println("Bad student.");
        }

        int a = 5, b = 1, c = 7;
        if ((a + b) <= c){
            System.out.println("Building a triangle is impossible.");
        } else if ((a + c) <= b) {
            System.out.println("Building a triangle is impossible.");
        } else if ((b + c) <= a) {
            System.out.println("Building a triangle is impossible.");
        } else {
            System.out.println("Building a triangle is POSSIBLE!");
        }

        int d = 7, e = 8;
        if (d < e) {
            System.out.println("d < e");
        } else if (d == e) {
            System.out.println("d = e");
        } else {
            System.out.println("d > e");
        }

        int n1 = 0, n2 = 0, n3 = 0, min;
        min = n1;
        if (n1 > n2) {
          min = n2;
        }

        if (min > n3){
            min = n3;
        }
        System.out.println("min = " + min);


        System.out.println("End.");
    }
}
