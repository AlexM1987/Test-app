package com.test.oop;

public class Human {

    private static int counter;
    private int age;
    private String name;

    public Human(){
        System.out.println("Human + 1");
        counter++;
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestHuman{
    public static void main(String[] args) {

       int n = Human.getCounter();

       Human h1 = new Human();
       int age = h1.getAge();

       new Human();
        new Human();
        new Human();
        System.out.println("Number of humans: " + Human.getCounter());
        System.out.println("Age: " + age);
    }
}
