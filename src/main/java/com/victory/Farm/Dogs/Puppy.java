package com.victory.farm.dogs;

import java.util.List;

public class Puppy extends Dog{

    private List<Instructions> instructionsList;

    public Puppy(DogBuilder dogBuilder, List<Instructions> instructions) {
        super(dogBuilder);
        this.instructionsList = instructions;
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
}
