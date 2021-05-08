package com.itstep.module2.submodule1;

public class Task05 {
    static final double RADIUS = 5f;

    public static void main(String[] args) {


        double pi = 3.14f;
        double result = pi * Math.pow(RADIUS, 2);
        System.out.println("Area of a circle = " + result);
        double result2 = 2 * pi * RADIUS;
        System.out.print("Circumference = " + result2);


    }
}
