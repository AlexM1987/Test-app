package com.test.oop.inh.animals;

import com.test.oop.Person;

public class Tester {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Tigra");
        tiger.attack();
        tiger.eat();
        tiger.play();
        tiger.sleep();

        GermanShepherd shepherd = new GermanShepherd();
        shepherd.herdSheep();
        shepherd.play();
    }

    Person o1 = new Person();
   // o1.setName("John");

}
