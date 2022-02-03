package com.devglan.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {

        TanishqCar tanishqCar = new TanishqCar();
        System.out.println(tanishqCar.getSteering());
        System.out.println(tanishqCar.getBrake());
        System.out.println(tanishqCar.getWiper());

        //polymorphism
        Car car = new TanishqCar();
        System.out.println(car.getBrake());

        List list = new ArrayList<>();
    }
}
