package com.basics.staticExample;

public class StaticUsage {

    static int a = 5;
    static int b;

    //staticblock
    static {
        System.out.println("Iam in static block");
        b = 4 * a;// b = 20;
    }

    public static void main(String[] args) {

        //a =5; b = 10;
        a = 2 * a;
        b = 10 * b;
        StaticUsage s1 = new StaticUsage();
        System.out.println(StaticUsage.a + " " + StaticUsage.b);


    }
}
