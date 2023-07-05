package com.test.strs;

public class Student {

    private int id;
    private String name;
    private String lastName;
    private int courseName;
    private double avg;

    public Student(int id, String name, String lastName, int courseName, double avg) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courseName = courseName;
        this.avg = avg;
    }
    public Student(){

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

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
