package com.test.oop.inh.task;

public class Superclient extends Client{
    private String functions;

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public Superclient(){
        super(0, null, null, null, null, "Super admin");
       // this.setRole("Super admin"); // можно и так
    }
}
