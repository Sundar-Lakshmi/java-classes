package com.basics.introduction;

public class Obj {
    public static void main(String[] args){
        Student sundar = new Student(13, "Sundar", 78);
        Student premi = new Student(15, "Premi", 89);
        Student lakshmi = new Student(16, "Lakshmi", 90);
        System.out.println(sundar.rno);
        System.out.println(sundar.name);
        System.out.println(sundar.marks);

        Student s = new Student("$");
        System.out.println(s);
/*
        sundar.greeting();
*/


    }

}

