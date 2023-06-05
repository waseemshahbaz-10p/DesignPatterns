package Patterns.factorymethod;


interface Vehicle {
    void drive();
}


class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}


class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}


class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}


abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}


class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}


class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}


class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
