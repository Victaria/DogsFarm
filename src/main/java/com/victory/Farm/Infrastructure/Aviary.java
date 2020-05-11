package com.victory.Farm.Infrastructure;

public class Aviary {

    private int id;
    private Boolean isBusy = false;
    private int dogId = -1;
    private Boolean isClear = true;

    public Aviary(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public Boolean getClear() {
        return isClear;
    }

    public void setClear(Boolean clear) {
        isClear = clear;
    }
}
