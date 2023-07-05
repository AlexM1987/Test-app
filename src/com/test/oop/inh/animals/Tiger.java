package com.test.oop.inh.animals;

public class Tiger extends Cat{
    void attack(){
        System.out.println(getName() + " is attacking.");
    }
    @Override
    void eat(){
        System.out.println(getName() + " is eating meat.");
    }

}
