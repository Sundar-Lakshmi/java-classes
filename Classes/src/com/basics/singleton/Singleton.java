package com.basics.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Calling constructor");
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            System.out.println("condition check");
            instance = new Singleton();
        }

            return instance;
    }




}
