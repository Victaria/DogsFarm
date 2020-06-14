package com.victory.farm.scheduleLogic;

import com.victory.farm.dogs.AdultDog;
import com.victory.farm.dogs.Dog;
import com.victory.farm.dogs.Puppy;
import com.victory.farm.infrastructure.Aviary;
import com.victory.farm.Storage;

public class Schedule {

    public static void createSchedule() {

        for (Dog dog : Storage.getDogsList()) {
            Actions.feed(dog);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()) {
            Actions.vetExamination(dog);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Aviary aviary : Storage.getAviaryList()) {
            Actions.aviaryClean(aviary);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()) {
            if (dog instanceof Puppy) {
                Actions.puppiesTrain((Puppy) dog);
            }
            if (dog instanceof AdultDog) {
                Actions.adultsWork((AdultDog) dog);
            }
            if (dog instanceof AdultDog) {
                Actions.dogsCameHome(dog);
            }
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()) {
            if (dog instanceof AdultDog || dog instanceof Puppy) {
                Actions.dogsCameHome(dog);
            }
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()) {
            Actions.feed(dog);
        }
        System.out.println("----------------End of the day!-----------------");
    }
}
