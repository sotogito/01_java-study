package com.ino.section03.abstraction;

public class CarRacer {
    private Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

    public void turnOn() {
        car.startUp();
    }
}
