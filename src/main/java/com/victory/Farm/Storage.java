package com.victory.Farm;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.Vet;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Dog> dogsList = new ArrayList<Dog>();
    private static List<Employee> staffList = new ArrayList<Employee>();
    private static List<Vet> vetList = new ArrayList<Vet>();
    private static List<Aviary> aviaryList = new ArrayList<Aviary>();

    public static void addDog(Dog dog) {
        dogsList.add(dog);
    }

    public static List<Dog> getDogsList() {
        return dogsList;
    }

    public static void addEmployee(Employee employee) {
        staffList.add(employee);
    }

    public static List<Employee> getStaffList() {
        return staffList;
    }

    public static void addVet(Vet vet) {
        vetList.add(vet);
    }

    public static List<Vet> getVetList() {
        return vetList;
    }

    public static void addAviary(Aviary aviary) {
        aviaryList.add(aviary);
    }

    public static List<Aviary> getAviaryList() {
        return aviaryList;
    }
}
