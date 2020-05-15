package com.victory.farm.dogs;

import java.util.List;

public class DogBuilder {
    private int id;
    private String name;
    private Boolean isHealthy = false;
    private Boolean isFed = false;

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

    public Dog buildPuppy(List<Instructions> instructions){
        return new Puppy(this, instructions);
    }

    public Dog buildAdult(){
        return new AdultDog(this);
    }

    public Dog buildOld(){
        return new OldDog(this);
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

 /*   public List<Instructions> getInstructionsList() {
        return instructionsList;
    }

    public Age getAge() {
        return age;
    }*/
}
