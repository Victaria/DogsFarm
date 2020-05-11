package com.victory.Farm.Staff;

import com.victory.Farm.Dogs.Dog;

import java.util.Date;

public class Vet{

    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public Vet(int id, String name, String surname, Date birthDate) {
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

    public void vetExamination(Dog dog){
        System.out.println("Vet "+ "" + " examines a dog " + dog.getName());
        if (!dog.getHealthy()) {
            System.out.println("Dog "+ dog.getName() + " is ill.");
            cure(dog);
        }
        System.out.println("Dog "+ dog.getName() + " is healthy.");
    }

    public void cure(Dog dog){
        System.out.println("Vet "+ "" + " cures a dog " + dog.getName());
        dog.setHealthy(true);
    }
}
