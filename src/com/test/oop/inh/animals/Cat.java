package com.test.oop.inh.animals;

public class Cat extends DA{
    @Override
    void sleep(){
        super.sleep();
        super.sleep();
        super.sleep();
    }
    @Override
    void eat(){
        System.out.println(getName() + " is drinking milk");
    }
    @Override
    void play(){
        System.out.println(getName() + " is playing with a mouse.");
    }
    @Override
    void voice(){
        System.out.println("Meow - meow - meeeeow");
    }
}
