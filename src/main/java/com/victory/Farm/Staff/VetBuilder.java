package com.victory.Farm.Staff;

import java.util.Date;

public class VetBuilder {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public VetBuilder id(int id) {
        this.id = id;
        return this;
    }

    public VetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public VetBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public VetBuilder birthDate(Date date) {
        this.birthDate = date;
        return this;
    }

    public Vet build() {
        return new Vet(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

}
