package com.victory.farm.scheduleLogic;

import com.victory.farm.staff.Staff;

public abstract class ScheduleHandle {
    public Staff staff;
    protected Container container;

    public void handle(){
        container.handle();
    }
}
