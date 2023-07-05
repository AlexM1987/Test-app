package com.test.oop;

public class Cat {
    private int age;
    private String name;
    private char gender;
    private boolean hasOwner;
    private double weight;
    public void play(){
        System.out.println("The cat is playing.");
    }
    public void eat(){
        System.out.println("The cat is eating.");
    }
    public void sleep(){
        System.out.println("The cat is sleeping.");
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setHasOwner(boolean newHasOwner){
        hasOwner = newHasOwner;
    }
    public boolean getHasOwner(){ //isHasOwner is also correct
        return hasOwner;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }

    public void setGender(char newGender){
        gender = newGender;
    }
    public char getGender(){
        return gender;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }
    public double getWeight(){
        return weight;
    }
}

class CatTester{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.play();
        c1.eat();
        c1.sleep();
        c1.setGender('m');
        c1.setHasOwner(true);
        c1.setWeight(8.35);
        System.out.println(c1.getGender());
        System.out.println(c1.getHasOwner());
        System.out.println(c1.getWeight());

    }
}
