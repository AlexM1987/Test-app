package com.test.oop.inh.animals;

import com.test.oop.Person;

//DA - domestic animal
public class DA extends Animal{

    private Person owner;

    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }


    void sleep(){
        System.out.println(getName() + " is sleeping.");
    }
    void eat(){
        System.out.println(getName() + " is eating.");
    }
    void play(){
        System.out.println(getName() + " is playing.");
    }
    void voice (){
        System.out.println("some voice...");
    }
}
