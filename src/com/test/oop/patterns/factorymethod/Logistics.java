package com.test.oop.patterns.factorymethod;

public abstract class Logistics {

    abstract void planDelivery();
    abstract Transport createTransport();

}

class SeaLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Sea delivery plan.");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}

class FlightLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Flight delivery plan.");
    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}

class RoadLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Road delivery plan.");
    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}

class LogisticProvider{
    public static Logistics chooseLogistics (String type){
        switch (type){
            case "AIR":
                return new FlightLogistics();
            case "SEA":
                return new SeaLogistics();
            case "ROAD":
                return new RoadLogistics();
            default:
                System.out.println("Wrong type: " + type);
                return new RoadLogistics();
        }
    }
}

class LogisticClient{
    public static void main(String[] args) {
        Logistics logistics = LogisticProvider.chooseLogistics("AIR");
       logistics.createTransport();
       logistics.planDelivery();

    }
}
