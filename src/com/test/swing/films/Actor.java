package com.test.swing.films;

public class Actor {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private long id;
    private String name;

    public Actor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
