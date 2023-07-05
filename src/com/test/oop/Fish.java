package com.test.oop;

public class Fish {
    private String size;
    private boolean livesInColdWater;
    private String water;
    public void swim(){
        System.out.println("The fish is swimming fast.");
    }
    public void water(){
        System.out.println("The fish lives in " + water + " water.");
    }

    public void setSize(String newSize){
        size = newSize;
    }
    public String getSize(){
        return size;
    }

    public void setLivesInColdWater(boolean newLICW){
        livesInColdWater = newLICW;
    }
    public boolean getLivesInColdWater(){
        return livesInColdWater;
    }

    public void setWater(String newWater){
        water = newWater;
    }
    public String getWater(){
        return water;
    }
}

class FishTester{
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.setSize("Big fish");
        f1.setWater("salty");
        f1.setLivesInColdWater(true);
        f1.swim();
        f1.water();
        System.out.println("It is a " + f1.getSize() + ".");
        System.out.println("Does it like cold water? - " + f1.getLivesInColdWater());
        Fish f2 = new Fish();

    }
}
