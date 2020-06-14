package com.victory.farm.staff;

import java.util.Date;

public class StaffBuilder {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public StaffBuilder id(int id) {
        this.id = id;
        return this;
    }

    public StaffBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StaffBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public StaffBuilder birthDate(Date date) {
        this.birthDate = date;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }

    public Vet buildVet() {
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
