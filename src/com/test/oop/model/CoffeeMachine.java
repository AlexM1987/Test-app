package com.test.oop.model;

import com.test.oop.init.Third;

public class CoffeeMachine {

    private final double maxWaterTank = 1000; //ml
    private final double maxCoffeeTank = 0.5; //kg
    private final double maxMilkTank = 500; //ml
    private final double maxGarbageTank = 0.5; //kg

    private double waterTank;
    private double coffeeTank;
    private double milkTank;

    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;

    private double garbageTank;
    private int currentWaterTemp;
    private boolean isActive = false;
    private boolean isOn = false;


    public void addWater(int extraWater){
        if((extraWater + waterTank) >= maxWaterTank){
            System.out.println("Can't add water.");
        }else {
            waterTank = waterTank +  extraWater;
            System.out.println("Current water: " + waterTank + "(ml)");
        }
    }



    public void addCoffee(int extraCoffee){
        if((extraCoffee + coffeeTank) >= maxCoffeeTank){
            System.out.println("Can't add coffee.");
        }else {
            coffeeTank = coffeeTank + extraCoffee;
            System.out.println("Current coffee: " + coffeeTank + "(kg)");
        }
    }



    public void addMilk(int extraMilk){
        if((extraMilk + milkTank) >= maxMilkTank){
            System.out.println("Can't add milk.");
        }else {
            milkTank = milkTank + extraMilk;
            System.out.println("Current milk: " + milkTank + "(ml)");
        }
    }



    CoffeeMachine(String model){
        salesCounter++;
        this.model = model;
    }

    public void switchOn() throws InterruptedException {
        if(!isOn){
            System.out.println("CoffeeMachine " + model + " is starting...");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine " + model + " is started!");
        }else {
            System.out.println("Is already started!");
        }
    }

    public void switchOff() throws InterruptedException {
        if(isOn){
            System.out.println("CoffeeMachine " + model + " is stopping...");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine " + model + " is stopped!");
        }else {
            System.out.println("Is already stopped!");
        }
    }

    public void makeACupOfCoffee() throws InterruptedException {
        if((waterTank >= 50) && (coffeeTank >= 10) && (garbageTank < maxGarbageTank)){
            Thread.sleep(2000);
            System.out.println("Take your americano.");
            waterTank = waterTank - 50;
            coffeeTank = coffeeTank - 10;
            garbageTank = garbageTank + 60;
            numberOfCups++;
        }
        if(waterTank < 50){
            addWater(200);
        }
        if(coffeeTank < 10){
            addCoffee(200);
        }
        if(garbageTank == maxGarbageTank){
            System.out.println("Throw the garbage.");
            garbageTank = 0;
        }
    }


}
