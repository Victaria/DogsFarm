package com.victory.Farm.Dogs;

import java.util.List;

public class Dog {
    private int id;
    private String name;
    private Boolean isHealthy;
    private Boolean isFed;
    private List<Instructions> instructionsList;
    private Age age;

    public Dog(DogBuilder dogBuilder) {
        this.id = dogBuilder.getId();
        this.name = dogBuilder.getName();
        this.isHealthy = dogBuilder.getHealthy();
        this.isFed = dogBuilder.getFed();
        this.instructionsList = dogBuilder.getInstructionsList();
        this.age = dogBuilder.getAge();
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

    public List<Instructions> getInstructionsList() {
        return instructionsList;
    }

    public void setInstructionsList(List<Instructions> instructionsList) {
        this.instructionsList = instructionsList;
    }

    public void addInstruction(Instructions instruction) {
        if (!instructionsList.contains(instruction)) {
            instructionsList.add(instruction);
        }
    }

    public Boolean knowsInstruction(Instructions instruction) {
        return instructionsList.contains(instruction);
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void dogAtHome() {
        System.out.println("Dog " + getName() + " is at home now.");
    }

}
