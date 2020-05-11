package com.victory.Farm.ScheduleLogic;

import com.victory.Farm.Dogs.Age;
import com.victory.Farm.Dogs.Dog;
import com.victory.Farm.Infrastructure.Aviary;
import com.victory.Farm.Storage;

public class Schedule {

    public static void createSchedule(){

        for (Dog dog : Storage.getDogsList()){
            Actions.feed(dog);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()){
            Actions.vetExamination(dog);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Aviary aviary: Storage.getAviaryList()){
            Actions.aviaryClean(aviary);
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()){
            switch (dog.getAge()){
                case PUPPY:
                    Actions.puppiesTrain(dog);
                    break;
                case ADULT:
                    Actions.adultsWork(dog);
                    break;
                case OLD:
                    Actions.dogsCameHome(dog);
                    break;
            }
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()){
            if (dog.getAge().equals(Age.ADULT) || dog.getAge().equals(Age.PUPPY)){
                Actions.dogsCameHome(dog);
            }
        }
        System.out.println("---------------------------------next step------------------------------------");

        for (Dog dog : Storage.getDogsList()){
            Actions.feed(dog);
        }
         System.out.println("----------------End of the day!-----------------");
    }

}
