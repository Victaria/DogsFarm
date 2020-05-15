package com.victory.farm.staff;

import com.victory.farm.dogs.*;
import com.victory.farm.infrastructure.Aviary;
import com.victory.farm.infrastructure.DogsArea;

import java.util.List;

public class Employee extends Staff{

    public Employee(StaffBuilder staffBuilder) {
        super(staffBuilder);
    }

    public synchronized void feed(Dog dog) {
        if (!dog.isFed()) dog.setFed(true);
        if (dog instanceof OldDog){
            System.out.println("Employee " + getName() + " is feeding old dog " + dog.getName());
        } else if (dog instanceof AdultDog){
            System.out.println("Employee " + getName() + " is feeding adult dog " + dog.getName());
        } else if (dog instanceof Puppy){
            System.out.println("Employee " + getName() + " is feeding puppy " + dog.getName());
        }
    }

    public synchronized void aviaryClean(Aviary aviary) {
        if (!aviary.isClear()) {
            System.out.println("Employee " + getName() + " is cleaning an aviary " + aviary.getId());
            aviary.setClear(true);
        }
    }

    public synchronized void puppiesTrain(Puppy puppy) {
        int i = 0;
        System.out.println("Puppy " + puppy.getName() + " has a training now with " + getName() + " at " + DogsArea.getInstance().getName());
        List<Instructions> instructionsList = puppy.getInstructionsList();
        for (Instructions instruction : Instructions.values()) {
            if (i < 2) {
                if (instructionsList.isEmpty()) {
                    instructionsList.add(instruction);
                    i++;
                    System.out.println("Puppy " + puppy.getName() + " is learning instruction " + instruction.name());
                } else if (!instructionsList.contains(instruction)) {
                    instructionsList.add(instruction);
                    i++;
                    System.out.println("Puppy " + puppy.getName() + " is learning instruction " + instruction.name());
                }
            } else break;
        }
        if (i < 2) System.out.println("Puppy " + puppy.getName() + " knows all instructions.");
    }

    public void adultsWork(AdultDog dog) {
        System.out.println("Adult dog " + dog.getName() + " is working now with " + getName());
    }
}
