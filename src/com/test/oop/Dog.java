package com.test.oop;

public class Dog {

    private long id;
    private String name;
    private String type;
    private char gender;
    private  int age;
    private double w;
    private double h;

//Getters && Setters - методы для получения и модификации private полей

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){ // по стандарту
        return age;
    }

    public void setAge(int newAge){ //по стандарту
        if(newAge < 0){
            System.out.println("Incorrect age: " + newAge);
        }else {
            age = newAge;
        }
    }

    public char getGen(){ // не по стандарту
        return gender;
    }

    public void setGen(char gen){ // не по стандарту
        gender = gen;
    }


}

class dogTester{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Tuzik");

        System.out.println("Name is " + d1.getName());

        d1.setAge(-2);
        System.out.println("Age is " + d1.getAge());

//        d1.setGen('f');
//        char g = d1.setName();
//        System.out.println(g);
    }
}