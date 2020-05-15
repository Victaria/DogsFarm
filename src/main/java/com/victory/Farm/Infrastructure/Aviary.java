package com.victory.farm.infrastructure;

public class Aviary {

    private int id;
    private Boolean isBusy;
    private int dogId;
    private Boolean isClear;

    public Aviary(AviaryBuilder aviaryBuilder) {
        this.id = aviaryBuilder.getId();
        this.isBusy = aviaryBuilder.isBusy();
        this.dogId = aviaryBuilder.getDogId();
        this.isClear = aviaryBuilder.isClear();
    }

    public int getId() {
        return id;
    }

    public Boolean isBusy() {
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

    public Boolean isClear() {
        return isClear;
    }

    public void setClear(Boolean clear) {
        isClear = clear;
    }
}
