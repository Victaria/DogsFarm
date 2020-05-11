package com.victory.Farm;

import com.victory.Farm.Dogs.Age;
import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Dogs.Instructions;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.ScheduleLogic.Schedule;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.Vet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        initialize();
        dogToAviary();
        Schedule.createSchedule();
    }

    public static void initialize() throws ParseException {
        Storage.addEmployee(new Employee(1, "Viktoria", "Vishnyakova", new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1999")));
        Storage.addEmployee(new Employee(2, "Arsen", "Holod", new SimpleDateFormat("dd.MM.yyyy").parse("18.10.1995")));
        Storage.addEmployee(new Employee(3, "Anna", "Kron", new SimpleDateFormat("dd.MM.yyyy").parse("08.02.1992")));

        Storage.addAviary(new Aviary(1));
        Storage.addAviary(new Aviary(2));
        Storage.addAviary(new Aviary(3));
        Storage.addAviary(new Aviary(4));
        Storage.addAviary(new Aviary(5));
        Storage.addAviary(new Aviary(6));

        Storage.addVet(new Vet(1, "Helen", "Vaneeva", new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1985")));

        Storage.addDog(new Dog(1, "Reks", true, true, new ArrayList<Instructions>(Arrays.asList(Instructions.COME, Instructions.BARK, Instructions.SIT)), Age.PUPPY));
        Storage.addDog(new Dog(2, "Bars", Age.OLD));
        Storage.addDog(new Dog(3, "Kelly", Age.ADULT));
        Storage.addDog(new Dog(4, "North", true, false, new ArrayList<Instructions>(Arrays.asList(Instructions.PLACE, Instructions.STAY, Instructions.STAND)), Age.PUPPY));
        Storage.addDog(new Dog(5, "Little", true, false, new ArrayList<Instructions>(Arrays.asList(Instructions.GUARD, Instructions.NO)), Age.PUPPY));
    }

    public static void dogToAviary(){
        int i = 0;
        for (Aviary aviary: Storage.getAviaryList()){
            if (!aviary.getBusy()){
                if (i < Storage.getDogsList().size()){
                    aviary.setBusy(true);
                    aviary.setClear(false);
                    aviary.setDogId(Storage.getDogsList().get(i).getId());
                    System.out.println("Dog " + Storage.getDogsList().get(i).getName() + " is now at Aviary #" + aviary.getId());
                    i++;
                } else break;
            }
        }
    }
}
