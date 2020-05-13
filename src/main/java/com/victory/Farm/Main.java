package com.victory.Farm;

import com.victory.Farm.Dogs.Age;
import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Dogs.DogBuilder;
import com.victory.Farm.Dogs.Instructions;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Infrastructure.AviaryBuilder;
import com.victory.Farm.ScheduleLogic.Schedule;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.EmployeeBuilder;
import com.victory.Farm.Staff.Vet;
import com.victory.Farm.Staff.VetBuilder;

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
        Storage.addEmployee(new EmployeeBuilder()
                .id(1)
                .name("Viktoria")
                .surname("Vishnyakova")
                .birthDate(new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1999"))
                .build());
        Storage.addEmployee(new EmployeeBuilder()
                .id(2)
                .name("Arsen")
                .surname("Holod")
                .birthDate(new SimpleDateFormat("dd.MM.yyyy").parse("18.10.1995"))
                .build());
        Storage.addEmployee(new EmployeeBuilder()
                .id(3).name("Anna")
                .surname("Kron")
                .birthDate(new SimpleDateFormat("dd.MM.yyyy").parse("08.02.1992"))
                .build());

        Storage.addAviary(new AviaryBuilder()
                .id(1)
                .isBusy(false).dogId(-1)
                .isClear(true)
                .build());
        Storage.addAviary(new AviaryBuilder()
                .id(2)
                .isBusy(false).dogId(-1)
                .isClear(false)
                .build());
        Storage.addAviary(new AviaryBuilder()
                .id(3)
                .isBusy(false).dogId(-1)
                .isClear(true)
                .build());
        Storage.addAviary(new AviaryBuilder()
                .id(4)
                .isBusy(false).dogId(-1)
                .isClear(false)
                .build());
        Storage.addAviary(new AviaryBuilder()
                .id(5)
                .isBusy(false).dogId(-1)
                .isClear(false)
                .build());
        Storage.addAviary(new AviaryBuilder()
                .id(6)
                .isBusy(false).dogId(-1)
                .isClear(true)
                .build());

        Storage.addVet(new VetBuilder()
                .id(1)
                .name("Helen")
                .surname("Vaneeva")
                .birthDate(new SimpleDateFormat("dd.MM.yyyy").parse("14.12.1985"))
                .build());

        Storage.addDog(new DogBuilder()
                .id(1).name("Reks")
                .isFed(true)
                .isHealthy(true)
                .instructionsList(new ArrayList<Instructions>(Arrays.asList(Instructions.COME, Instructions.BARK, Instructions.SIT)))
                .age(Age.PUPPY).build());
        Storage.addDog(new DogBuilder()
                .id(2).name("Bars")
                .isFed(false)
                .isHealthy(false)
                .instructionsList(new ArrayList<Instructions>(Arrays.asList(Instructions.COME, Instructions.BARK, Instructions.SIT)))
                .age(Age.ADULT).build());
        Storage.addDog(new DogBuilder()
                .id(3).name("Kelly")
                .isFed(true)
                .isHealthy(true)
                .instructionsList(new ArrayList<Instructions>(Arrays.asList(Instructions.COME, Instructions.BARK, Instructions.SIT)))
                .age(Age.OLD).build());
        Storage.addDog(new DogBuilder()
                .id(4).name("North")
                .isFed(false)
                .isHealthy(false)
                .instructionsList(new ArrayList<Instructions>(Arrays.asList(Instructions.PLACE, Instructions.STAY, Instructions.STAND)))
                .age(Age.PUPPY).build());
        Storage.addDog(new DogBuilder()
                .id(5)
                .name("Little")
                .isFed(false)
                .isHealthy(true)
                .instructionsList(new ArrayList<Instructions>(Arrays.asList(Instructions.GUARD, Instructions.NO)))
                .age(Age.PUPPY).build());

    }

    public static void dogToAviary() {
        int i = 0;
        for (Aviary aviary : Storage.getAviaryList()) {
            if (!aviary.isBusy()) {
                if (i < Storage.getDogsList().size()) {
                    aviary.setBusy(true);
                    aviary.setClear(false);
                    aviary.setDogId(Storage.getDogsList().get(i).getId());
                    System.out.println("Dog " + Storage.getDogsList().get(i).getName() + " is now at Aviary #" + aviary.getId());
                    i++;
                } else {
                    break;
                }
            }
        }
    }
}
