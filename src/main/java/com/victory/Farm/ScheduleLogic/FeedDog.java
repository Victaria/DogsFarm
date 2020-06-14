package com.victory.farm.scheduleLogic;

import com.victory.farm.dogs.Dog;
import com.victory.farm.staff.Employee;
import com.victory.farm.staff.Staff;

public class FeedDog extends Container {
    private Dog dog;
    private Staff staff;

    public FeedDog(Dog dog, Staff staff) {
        this.dog = dog;
        this.staff = staff;
    }

    public void handle(){
        if (staff instanceof Employee){
            ((Employee) staff).feed(dog);
        } else {
            super.handle();
        }
    }
}
