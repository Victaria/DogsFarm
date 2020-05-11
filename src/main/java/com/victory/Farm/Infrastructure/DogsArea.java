package com.victory.Farm.Infrastructure;

public class DogsArea {

    private static volatile DogsArea instance;
    public static DogsArea getInstance(){
        DogsArea localInstance = instance;
        if (localInstance == null){
            synchronized (DogsArea.class) {
                localInstance = instance;
                if (localInstance == null){
                    instance = localInstance = new DogsArea();
                }
            }
        }
        return localInstance;
    }

    public String getName(){
        return "DogsArea";
    }
}
