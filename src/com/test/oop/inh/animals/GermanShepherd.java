package com.test.oop.inh.animals;

public class GermanShepherd extends Dog{
    void herdSheep(){
        System.out.println(getName() + " is herding sheep.");
    }
    @Override
    void play(){
        System.out.println(getName() + " is playing with a bone.");
    }
}
