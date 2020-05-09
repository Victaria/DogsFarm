package com.victory.Farm.Dogs;


import java.util.ArrayList;

public class Dog {
    private int id;
    private String name;
    private Boolean isHealthy = true;
    private Boolean isFed = true;
    private ArrayList<Instructions> instructionsList;
    private Age age;

    public Dog(int id, String name, Age age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Dog(int id, String name, Boolean isHealthy, Boolean isFed, ArrayList<Instructions> instructionsList, Age age) {
        this.id = id;
        this.name = name;
        this.isHealthy = isHealthy;
        this.isFed = isFed;
        this.instructionsList = instructionsList;
        this.age = age;
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

    public Boolean getHealthy() {
        return isHealthy;
    }

    public void setHealthy(Boolean healthy) {
        isHealthy = healthy;
    }

    public Boolean getFed() {
        return isFed;
    }

    public void setFed(Boolean fed) {
        isFed = fed;
    }

    public ArrayList<Instructions> getInstructionsList() {
        return instructionsList;
    }

    public void setInstructionsList(ArrayList<Instructions> instructionsList) {
        this.instructionsList = instructionsList;
    }

    public void addInstruction(Instructions instruction){
        if (!instructionsList.contains(instruction))
            instructionsList.add(instruction);
    }

    public Boolean knowsInstruction(Instructions instruction){
        return instructionsList.contains(instruction);
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
}
