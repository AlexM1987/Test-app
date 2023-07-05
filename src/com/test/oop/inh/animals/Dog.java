package com.test.oop.inh.animals;

public class Dog extends DA{
    @Override
    void sleep(){
        super.sleep();
    }
    @Override
    void eat(){
        System.out.println(getName() + " is eating bones");
    }
    @Override
    void play(){
        System.out.println(getName() + " is playing with a ball.");
    }
    @Override
    void voice(){
        System.out.println("Woof - woof - woof.");
    }
    void serve(){
        System.out.println(getName() + " is following commands.");
    }
}
