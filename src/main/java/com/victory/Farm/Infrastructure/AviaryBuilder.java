package com.victory.farm.infrastructure;

public class AviaryBuilder {
    private int id;
    private Boolean isBusy = false;
    private int dogId = -1;
    private Boolean isClear = true;

    public AviaryBuilder id(int id) {
        this.id = id;
        return this;
    }

    public AviaryBuilder isBusy(Boolean busy) {
        this.isBusy = busy;
        return this;
    }

    public AviaryBuilder dogId(int id) {
        this.dogId = id;
        return this;
    }

    public AviaryBuilder isClear(Boolean clear) {
        this.isClear = clear;
        return this;
    }

    public Aviary build(){
        return new Aviary(this);
    }

    public int getId() {
        return id;
    }

    public Boolean isBusy() {
        return isBusy;
    }

    public int getDogId() {
        return dogId;
    }

    public Boolean isClear() {
        return isClear;
    }
}
