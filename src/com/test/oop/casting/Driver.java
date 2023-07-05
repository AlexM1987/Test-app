package com.test.oop.casting;

public class Driver {
    private char[] types;


    public void drive() {
        System.out.println("driving...");
    }

    public void shareDocs() {
        System.out.println("sharing documents... Types: ");
        for (char type : types){
            System.out.println(type);
        }

    }

    public Driver(char[] types) {
        this.types = types;
    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }
}

class Programmer extends Driver{

    public Programmer(char[] types) {
        super(types);
    }

    public void makeCode(){
        System.out.println("main(){}...");
    }
}

class Student extends Driver {
    public Student(char[] types) {
        super(types);
    }

    public void learn(){
        System.out.println("Learning...");
    }
}

class  Test{

    public static void testDriver(Driver driver){
        driver.shareDocs();
        driver.drive();

        if (driver instanceof Programmer){
            Programmer p = (Programmer) driver;
            p.makeCode();
        }else if (driver instanceof Student){
            Student s = (Student) driver;
            s.learn();
        }
    }

    public static void main(String[] args) {
        char[] types = {'A', 'B'};
        Driver d = new Driver(types);

        d.drive();
        d.shareDocs();

        char[] types2 = {'B'};
        Programmer p1 = new Programmer(types2);
        p1.drive();
        p1.makeCode();
        p1.drive();
        p1.shareDocs();

        //если есть IS - A relationship
        Driver d1 = p1;

        Object o1 = p1;

        Object o2 = new int[5];//пример апкастинка массива интов в обджект

        //downCasting
        Programmer p10 = (Programmer) d1;
        p10.makeCode();

        //
        Driver d10 = new Programmer(types);

        if(d10 instanceof Student){
            Student st10 = (Student) d10;
            st10.learn();
        }else {
            System.out.println("d10 is not a student");
        }

        //проверка на совпадение класса с указанным. Проверка на ложность отсутствует
        if(d10.getClass() == Student.class){
            Student st10 = (Student) d10;
            st10.learn();
        }else {
            System.out.println("d10 is not a student.class");
        }

        Object o100 = new Triangle(2, 5, 6);

        testDriver(p1);

    }
}
