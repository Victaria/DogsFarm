package com.victory.Farm.Staff;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.AviaryBuilder;

import java.util.Date;

public class EmployeeBuilder {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public EmployeeBuilder id(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public EmployeeBuilder birthDate(Date date) {
        this.birthDate = date;
        return this;
    }

    public Employee build() {
        return new Employee(this);
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
