package com.basics.staticExample;

public class Common {
        String name;
        int age;
        String gender;
        static long population;

        Common(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
            Common.population = population+1;
        }
    }

