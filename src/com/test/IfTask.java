package com.test;

public class IfTask {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;


        int cash = 100, age = 40, iq = 125;
        boolean isRich = false;
        boolean isClever = false;
        boolean isYoung = false;

        if (cash > 1000) {
            isRich = true;
        }
        if (iq > 80){
            isClever = true;
        }
        if (age < 25){
            isYoung = true;
        }
        if (isClever && isRich && isYoung) {
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }
}
