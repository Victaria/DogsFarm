package com.victory.farm.staff;

import com.victory.farm.dogs.Dog;

import java.util.Date;

public class Vet extends Staff{

    public Vet(StaffBuilder staffBuilder) {
        super(staffBuilder);
    }

    public void vetExamination(Dog dog) {
        System.out.println("Vet " + "" + " examines a dog " + dog.getName());
        if (!dog.isHealthy()) {
            System.out.println("Dog " + dog.getName() + " is ill.");
            cure(dog);
        }
        System.out.println("Dog " + dog.getName() + " is healthy.");
    }

    public void cure(Dog dog) {
        System.out.println("Vet " + "" + " cures a dog " + dog.getName());
        dog.setHealthy(true);
    }
}
