package com.test.oop.inh;

public class Person {

    private int id;
    private String name;
    private String lastName;
    private char gender;

    //Конструктор - единственный способ создать объект.
    //Конструктор никогда ничего не возвращает.
    public Person(){
        //вызов существующего в этом классе конструктора.
        // Вызов конструктора должен быть первым лайном
        this (0, "Stranger");
    }


    //Constructor, который будет инициализировать поля объекта.
    public Person(int id, String name, String lastName, char gender){
        System.out.println("Person + 1");
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(int id, String name){
        this (id, name, null, ' ');
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(134);
        p.setGender('f');
        p.setName("Lisa");
        p.setLastName("Ivanova");

        System.out.println(p.toString());

        Person p2 = new Person();
        System.out.println(p2.toString());


        Employee e1 = new Employee();
        e1.setId(342);
        e1.setName("John");
        e1.setLastName("Johnson");
        e1.setGender('m');
        e1.setSalary(1250);

        System.out.println(e1);

        Person p3 = new Person(55, "Mike", "Tyson", 'm');
        System.out.println(p3);

        Person p5 = new Person(666, "Tom");

        Employee e2 = new Employee();
        System.out.println(e2);

        Employee e3 = new Employee(3421, "Alex", "Ivanov", 'm', 325625);
        System.out.println(e3);

        Student s1 = new Student(325454, "Max", "Ivanov", 'm', 8.8);
        System.out.println(s1);

    }
}
