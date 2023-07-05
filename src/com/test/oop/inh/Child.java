package com.test.oop.inh;

import com.test.oop.Cat;

//class Child расширяет(наследует) класс Parent
// 'IS-A' relationship. Когда наследник есть родитель.
public class Child extends Parent{

    //'HAS - A' relationship
    private Cat cat;

    public void setCat(Cat cat) {
        this.cat = cat;
    }
    public Cat getCat() {
        return cat;
    }

    private int iq;

    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public void jump(){
        System.out.println(getName() + " is jumping.");
    }
/*Переопределение - способность изменить функционал
* который был до этого в бвзовом классе*/
    @Override
    public void sayMyName(){
        //super - ссылка на суперкласс
        super.sayMyName();
        System.out.println("Меня зовут " + getName());
    }
}
