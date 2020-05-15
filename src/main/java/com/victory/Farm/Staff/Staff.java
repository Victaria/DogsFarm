package com.victory.farm.staff;

import java.util.Date;

public class Staff {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;

    public Staff(StaffBuilder staffBuilder) {
        this.id = staffBuilder.getId();
        this.name = staffBuilder.getName();
        this.surname = staffBuilder.getSurname();
        this.birthDate = staffBuilder.getBirthDate();
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
}
