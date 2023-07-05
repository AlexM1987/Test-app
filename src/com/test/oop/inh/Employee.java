package com.test.oop.inh;

public class Employee extends Person{
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public Employee(){
//Прежде всего запускается конструктор родительского класса дабы обеспечить инициализацию.
        //Явный вызов конструктора родительского класса.
        //Если super не написать, вызов произойдет неявным образом.
        super();
    }

    public Employee(int id, String name, String lastName) {
        //вызов суперконструктора с параметрами. Такой конструктор должен существовать.
        super(id, name);
        this.setLastName(lastName);
    }

    public Employee(int id, String name, String lastName, char gender, long salary) {
        //вызов суперконструктора с параметрами. Такой конструктор должен существовать.
        super(id, name, lastName, gender);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}
