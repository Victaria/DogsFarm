package com.victory.farm.scheduleLogic;

import com.victory.farm.dogs.AdultDog;
import com.victory.farm.dogs.Dog;
import com.victory.farm.dogs.Puppy;
import com.victory.farm.infrastructure.Aviary;
import com.victory.farm.staff.Employee;
import com.victory.farm.staff.Vet;
import com.victory.farm.Storage;

public class Actions {

    private static ScheduleHandle scheduleHandle;

    private static int i = 0;
    private static int j = 0;

    public static void feed(Dog dog) {
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.feed(dog);
      /*  FeedDog feedDog = new FeedDog(dog, employee);
         scheduleHandle.container.add(feedDog);
        scheduleHandle.handle();*/
        i++;
    }

    public static void vetExamination(Dog dog) {
        if (j >= Storage.getVetList().size()) {
            j = 0;
        }
        Vet vet = Storage.getVetList().get(j);
        vet.vetExamination(dog);
        j++;
    }

    public static void aviaryClean(Aviary aviary) {
        if (!aviary.isClear()) {
            if (i >= Storage.getStaffList().size()) {
                i = 0;
            }
            Employee employee = Storage.getStaffList().get(i);
            employee.aviaryClean(aviary);
            i++;
        }
    }

    public static void puppiesTrain(Puppy puppy) {
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.puppiesTrain(puppy);
        i++;
    }

    public static void adultsWork(AdultDog adultDog) {
        if (i >= Storage.getStaffList().size()) {
            i = 0;
        }
        Employee employee = Storage.getStaffList().get(i);
        employee.adultsWork(adultDog);
        i++;
    }

    public static void dogsCameHome(Dog dog) {
        for (Aviary aviary : Storage.getAviaryList()) {
            if (aviary.getDogId() == dog.getId()) {
                dog.dogAtHome();
            }
        }
    }
}
