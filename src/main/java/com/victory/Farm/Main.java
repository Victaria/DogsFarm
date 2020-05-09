package com.victory.Farm;

import com.victory.Farm.Dogs.Age;
import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.Vet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        initialize();
    }

    public static void initialize() throws ParseException {
        new Employee(1, "Viktoria", "Vishnyakova", new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1999"));
        new Employee(2, "Arsen", "Holod", new SimpleDateFormat("dd.MM.yyyy").parse("18.10.1995"));
        new Employee(3, "Anna", "Kron", new SimpleDateFormat("dd.MM.yyyy").parse("08.02.1992"));

        new Aviary(1);
        new Aviary(2);
        new Aviary(3);
        new Aviary(4);
        new Aviary(5);

        new Vet(1, "Helen", "Vaneeva", new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1985"));

        new Dog(1, "Reks", Age.PUPPY);
        new Dog(2, "Bars", Age.OLD);
        new Dog(3, "Kelly", Age.ADULT);
        new Dog(4, "North", Age.PUPPY);
    }
}
