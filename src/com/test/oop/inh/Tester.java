package com.test.oop.inh;

import com.test.oop.Cat;

public class Tester {
    public static void main(String[] args) {
        //'USE' relationship
        Third th = new Third();
        th.setId(100);
        th.setName("John");
        th.setAge(45);
        th.setIq(75);

        th.sayMyName();
        th.run();
        th.jump();

        // 'USE' relationship
        Cat cat = new Cat();
        System.out.println(cat.toString());
        th.setCat(cat);

        System.out.println(th.toString());
    }
}
