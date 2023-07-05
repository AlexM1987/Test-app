package com.test.oop.inh;

public class Student extends Person{
    private double avg;

    public Student(int id, String name, String lastName, char gender, double avg){
        super(id, name, lastName, gender);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", avg=" + avg +
                '}';
    }
}
