package com.test.oop.patterns.factorymethod;

public abstract class Pizza {
    public abstract void printInfo();
}

class Pepperoni extends Pizza{
    @Override
    public void printInfo() {
        System.out.println("Ordering pepperoni.");
    }
}

class FourSeasons extends Pizza{
    @Override
    public void printInfo() {
        System.out.println("Ordering FourSeasons.");
    }

}
class BestPizza extends Pizza{
    @Override
    public void printInfo() {
        System.out.println("Ordering the best pizza ever.");
    }
}



class Pizzeria {
    public static Pizza makePizza (int key){
        switch (key){
            case 1:
                return new Pepperoni();
            case 2 :
                return new FourSeasons();
            case 3:
                return new BestPizza();
            default:
                throw new IllegalArgumentException("No such pizza");
        }
    }
}

class PizzaClient{
    public static void main(String[] args) {
        Pizza p1 = Pizzeria.makePizza(1);
        p1.printInfo();

        Pizza p2 = Pizzeria.makePizza(2);
        p2.printInfo();

        Pizza p3 = Pizzeria.makePizza(3);
        p3.printInfo();

        System.out.println("Yummy :)");
    }
}
