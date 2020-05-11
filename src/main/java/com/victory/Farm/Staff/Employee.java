package com.victory.Farm.Staff;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Dogs.Instructions;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Infrastructure.DogsArea;
import java.util.ArrayList;
import java.util.Date;

public class Employee{
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private Dog dog;

    public Employee(int id, String name, String surname, Date birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
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

    public void setDog(Dog dog){
        this.dog = dog;
    }

    public Dog getDog(){
        return dog;
    }

    public synchronized void feed(Dog dog){
        if (!dog.getFed()) dog.setFed(true);
        switch (dog.getAge()){
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

    public synchronized void aviaryClean(Aviary aviary){
        if (!aviary.getClear()){
            System.out.println("Employee "+ getName() + " is cleaning an aviary " + aviary.getId());
            aviary.setClear(true);
        }
    }

    public synchronized void puppiesTrain(Dog dog){
        int i = 0;
        System.out.println("Puppy " + dog.getName() + " has a training now with " + getName() + " at " + DogsArea.getInstance().getName());
        ArrayList<Instructions> instructionsArrayList = dog.getInstructionsList();
        for (Instructions instruction : Instructions.values()) {
            if (i < 2) {
                if (instructionsArrayList.isEmpty()){
                    instructionsArrayList.add(instruction);
                    i++;
                    System.out.println("Puppy " + dog.getName() + " is learning instruction " + instruction.name());
                } else if (!instructionsArrayList.contains(instruction)){
                    instructionsArrayList.add(instruction);
                    i++;
                    System.out.println("Puppy " + dog.getName() + " is learning instruction " + instruction.name());
                }
            } else break;
        }
        if (i < 2) System.out.println("Puppy " + dog.getName() + " knows all instructions.");
    }

    public void adultsWork(Dog dog){
        System.out.println("Adult dog " + dog.getName() + " is working now with " + getName());
    }
}
