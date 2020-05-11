package com.victory.Farm.ScheduleLogic;

import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Staff.Employee;
import com.victory.Farm.Staff.Vet;
import com.victory.Farm.Storage;

public class Actions {
    static int i = 0;
    static int j = 0;
    public static void feed(Dog dog){
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.feed(dog);
        i++;
    }

    public static void vetExamination(Dog dog){
        if (j >= Storage.getVetList().size()) {
            j = 0;
        }
        Vet vet = Storage.getVetList().get(j);
        vet.vetExamination(dog);
        j++;
    }

    public static void aviaryClean(Aviary aviary){
        if (!aviary.getClear()){
            if (i >= Storage.getStaffList().size()) {
                i = 0;
            }
            Employee employee = Storage.getStaffList().get(i);
            employee.aviaryClean(aviary);
            i++;
        }
    }

    public static void puppiesTrain(Dog dog){
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.puppiesTrain(dog);
        i++;
    }

    public static void adultsWork(Dog dog){
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.adultsWork(dog);
        i++;
    }

    public static void dogsCameHome(Dog dog){
        for (Aviary aviary: Storage.getAviaryList()) {
            if (aviary.getDogId() == dog.getId())
            dog.dogAtHome();
        }
    }
}
