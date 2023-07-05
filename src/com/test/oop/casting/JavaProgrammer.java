package com.test.oop.casting;

public abstract class JavaProgrammer {

    abstract void makeCode();

    public void playTennis(){
        System.out.println("Playing tennis...");
    }

}

class MiddleJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some good code here.");
        playTennis();
    }

}

class SeniorJavaDeveloper  extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some perfect code here.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("He is leaving the office.");
    }
}

class JuniorJavaDeveloper  extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some bad code here.");
    }

    void makeCoffeeForSenior(){
        System.out.println("He is making coffee for senior developer.");
    }
}

class Company {
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();
        JavaProgrammer programmer = (JavaProgrammer) junior; //upcasting

        Object o = (Object) new SeniorJavaDeveloper();
        Object o2 = (JavaProgrammer) new MiddleJavaDeveloper();

        JavaProgrammer jp = new JuniorJavaDeveloper(); // new SeniorJavaDeveloper();

        if(jp instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper)jp;
            sjd.leaveOffice();
        } else if(jp.getClass() == JuniorJavaDeveloper.class){
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper)jp;
        }

        JavaProgrammer [] programmers = {junior, (JavaProgrammer) o, (JavaProgrammer) o2, jp}; //неявный апкастинг
        System.out.println("programmers: " + programmers.length);

        for (JavaProgrammer prog : programmers){
            prog.makeCode();
        }

    }
}
