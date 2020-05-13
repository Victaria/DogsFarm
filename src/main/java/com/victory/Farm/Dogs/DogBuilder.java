package com.victory.Farm.Dogs;

import java.util.List;

public class DogBuilder {
    private int id;
    private String name;
    private Boolean isHealthy = false;
    private Boolean isFed = false;
    private List<Instructions> instructionsList;
    private Age age;

    public DogBuilder name(String name){
        this.name = name;
        return this;
    }

    public DogBuilder id(int id){
        this.id = id;
        return this;
    }

    public DogBuilder isHealthy(Boolean healthy){
        this.isHealthy = healthy;
        return this;
    }

    public DogBuilder isFed(Boolean fed){
        this.isFed = fed;
        return this;
    }

    public DogBuilder instructionsList(List<Instructions> instructionsList) {
        this.instructionsList = instructionsList;
        return this;
    }

    public DogBuilder age(Age age) {
        this.age = age;
        return this;
    }

    public Dog build(){
        return new Dog(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getHealthy() {
        return isHealthy;
    }

    public Boolean getFed() {
        return isFed;
    }

    public List<Instructions> getInstructionsList() {
        return instructionsList;
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
}
