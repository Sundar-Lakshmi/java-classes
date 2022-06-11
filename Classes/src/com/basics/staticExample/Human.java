package com.basics.staticExample;

public class Human {
    public static void main(String[] args) {

        Common Sundar = new Common("Sundar", 24, "Female");
        Common Premi = new Common("Lakshmi", 24, "Female");
        System.out.println(Sundar.name);
        System.out.println(Premi.age);
        System.out.println(Common.population);
        // static int a = 10;
    }

    public void greeting() {

    }
}
