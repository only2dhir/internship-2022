package com.devglan.inheritance;

public class TanishqCar extends Car{

    public String wiper;

    @Override
    public String getBrake() {
        return "Tanishq car brake";
    }

    public String getWiper() {
        return wiper;
    }

    public void setWiper(String wiper) {
        this.wiper = wiper;
    }

}
