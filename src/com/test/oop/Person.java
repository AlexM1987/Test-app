package com.test.oop;

/*Class <=> Model <=> Type <=> Template. Определяет
 будущие хар-ки и функуционал конкретных объектов*/
public class Person {
    //field - поля. Хар-ки будущего объекта.
    int age;
    String name;
    String lastName;
    char gender; // can be 'f' or 'm'
    boolean isSingle;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //methods <=> functions. Поведение будущих объектов.
    void sayMyName(){
        System.out.println("Hello, my name is " + name);
    }

    void dance(){
        System.out.println(name + " is dancing.");
    }

    void drink(){
        if(age >= 18){
            System.out.println("Vine or/and beer.");
        }else {
            System.out.println("Water, only water!");
        }
    }

    void job(){
        System.out.println(name + " is working.");
    }

    void coffee(){
        System.out.println(name + " is drinking coffee while working.");
    }
}

class Tester{
    public static void main(String[] args) {
        //Создание переменной типа Person
        Person person;
        //instance creation <=> object creation. Создаем объект с помощью оператора 'new'
        person = new Person();

        //instance field initialisation <=> object population
        person.name = "John";
        person.age = 32;
        person.gender = 'm';
        person.isSingle = true;
        person.lastName = "Jonson";

        //object behavior <=> methods invocation
        person.sayMyName();
        person.drink();
        person.dance();
        System.out.println("************************************");

        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 35;
        person2.gender = 'm';
        person2.isSingle = true;
        person2.lastName = "Smith";
        person2.sayMyName();
        person2.drink();
        person2.drink();
        person2.drink();
        person2.dance();
        person2.dance();
        System.out.println("************************************");

        Person person3 = new Person();
        person3.name = "Ann";
        person3.age = 17;
        person3.gender = 'f';
        person3.isSingle = true;
        person3.lastName = "Brown";
        person3.sayMyName();
        person3.drink();
        person3.dance();
        System.out.println("************************************");

        Person person4 = new Person();
        person4.name = "Max";
        person4.age = 22;
        person4.gender = 'm';
        person4.isSingle = false;
        person4.lastName = "Black";
        person4.sayMyName();
        person4.job();
        person4.coffee();
        System.out.println("************************************");

    }
}
