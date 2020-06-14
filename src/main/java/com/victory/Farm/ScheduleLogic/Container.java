package com.victory.farm.scheduleLogic;

import java.util.List;

public abstract class Container extends ScheduleHandle {
    protected List<ScheduleHandle> scheduleHandleList;

    public void add(ScheduleHandle scheduleHandle){
        scheduleHandleList.add(scheduleHandle);
        scheduleHandle.container = this;
    }
}
