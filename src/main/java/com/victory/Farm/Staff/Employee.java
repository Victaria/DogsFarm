package com.victory.Farm.Staff;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Dogs.Instructions;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Infrastructure.DogsArea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.getId();
        this.name = employeeBuilder.getName();
        this.surname = employeeBuilder.getSurname();
        this.birthDate = employeeBuilder.getBirthDate();
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public synchronized void feed(Dog dog) {
        if (!dog.isFed()) dog.setFed(true);
        switch (dog.getAge()) {
            case OLD:
                System.out.println("Employee " + getName() + " is feeding old dog " + dog.getName());
                break;
            case ADULT:
                System.out.println("Employee " + getName() + " is feeding adult dog " + dog.getName());
                break;
            case PUPPY:
                System.out.println("Employee " + getName() + " is feeding puppy " + dog.getName());
                break;
        }
    }

    public synchronized void aviaryClean(Aviary aviary) {
        if (!aviary.isClear()) {
            System.out.println("Employee " + getName() + " is cleaning an aviary " + aviary.getId());
            aviary.setClear(true);
        }
    }

    public synchronized void puppiesTrain(Dog dog) {
        int i = 0;
        System.out.println("Puppy " + dog.getName() + " has a training now with " + getName() + " at " + DogsArea.getInstance().getName());
        List<Instructions> instructionsList = dog.getInstructionsList();
        for (Instructions instruction : Instructions.values()) {
            if (i < 2) {
                if (instructionsList.isEmpty()) {
                    instructionsList.add(instruction);
                    i++;
                    System.out.println("Puppy " + dog.getName() + " is learning instruction " + instruction.name());
                } else if (!instructionsList.contains(instruction)) {
                    instructionsList.add(instruction);
                    i++;
                    System.out.println("Puppy " + dog.getName() + " is learning instruction " + instruction.name());
                }
            } else break;
        }
        if (i < 2) System.out.println("Puppy " + dog.getName() + " knows all instructions.");
    }

    public void adultsWork(Dog dog) {
        System.out.println("Adult dog " + dog.getName() + " is working now with " + getName());
    }
}
