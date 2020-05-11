package com.victory.Farm;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.Vet;
import java.util.ArrayList;

public class Storage {
    private static ArrayList<Dog> dogsList = new ArrayList<Dog>();
    private static ArrayList<Employee> staffList = new ArrayList<Employee>();
    private static ArrayList<Vet> vetList = new ArrayList<Vet>();
    private static ArrayList<Aviary> aviaryList = new ArrayList<Aviary>();

    public static void addDog(Dog dog){
        dogsList.add(dog);
    }

    public static ArrayList<Dog> getDogsList(){
        return dogsList;
    }

    public static void addEmployee(Employee employee){
        staffList.add(employee);
    }

    public static ArrayList<Employee> getStaffList(){
        return staffList;
    }

    public static void addVet(Vet vet){
        vetList.add(vet);
    }

    public static ArrayList<Vet> getVetList(){
        return vetList;
    }

    public static void addAviary(Aviary aviary){
        aviaryList.add(aviary);
    }

    public static ArrayList<Aviary> getAviaryList(){
        return aviaryList;
    }
}
