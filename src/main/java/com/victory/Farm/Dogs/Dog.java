package com.victory.farm.dogs;

import java.util.List;

public abstract class Dog {
    private int id;
    private String name;
    private Boolean isHealthy;
    private Boolean isFed;

    public Dog(DogBuilder dogBuilder) {
        this.id = dogBuilder.getId();
        this.name = dogBuilder.getName();
        this.isHealthy = dogBuilder.getHealthy();
        this.isFed = dogBuilder.getFed();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(Boolean healthy) {
        isHealthy = healthy;
    }

    public Boolean isFed() {
        return isFed;
    }

    public void setFed(Boolean fed) {
        isFed = fed;
    }

    public void dogAtHome() {
        System.out.println("Dog " + getName() + " is at home now.");
    }

}
