package com.devglan.inheritance;

public class Car {

    private String[] tyres = {"14", "15", "14", "15"};
    private String brake = "drum brake";
    private String steering = "manual steering";

    public String[] getTyres() {
        return tyres;
    }

    public void setTyres(String[] tyres) {
        this.tyres = tyres;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

}
