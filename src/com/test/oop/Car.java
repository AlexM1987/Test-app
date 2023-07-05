package com.test.oop;

import com.test.MathUtil;
import lombok.Data;

@Data

public class Car {

    double vEngine;
    int hp;
    int numberOfSeats;
    int numberOfGears;
    int currentGear;
    int wheelsNum;

    int maxSpeed;
    int currentSpeed;

    boolean noisy;
    boolean goodCar;
    String model;
    String color;
    String vinCode;


    void startEngine(){
        if(goodCar){
            System.out.println("Engine is starting. Success!");
        }else {
            System.out.println("Engine is starting....again...and again. Success!");
        }
    }

    void drive(){
        if(noisy){
            System.out.println("The car is working very loud.");
        }else {
            System.out.println("The car is working quietly.");
        }
    }

    void acceleration() throws InterruptedException {
        while (currentSpeed <= maxSpeed){
            switchGearUp();
            Thread.sleep(500);
            int temp = MathUtil.genRandom(10,40);
            currentSpeed += temp;
            System.out.println("Current speed is " + currentSpeed);
        }
    }

    void switchGearUp(){
        if(numberOfGears > currentGear){
            currentGear++;
            System.out.println("Current gear UP: " + currentGear);
        }else {
            System.out.println("Max gear number is reached.");
        }

    }

    void switchGearDown(){
        if(currentGear >= 1){
            currentGear--;
            System.out.println("Current gear UP: " + currentGear);
        }else {
            System.out.println("Min gear number is reached.");
        }
    }
}

class CarTester{
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.color = "Black";
        car.model = "BMW M5";
        car.numberOfGears = 6;
        car.maxSpeed = 250;
        car.currentSpeed = 0;
        car.currentGear = 0;
        car.acceleration();
    }
}
