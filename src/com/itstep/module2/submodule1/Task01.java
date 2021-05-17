package com.itstep.module2.submodule1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        int result = (int) x / (int) y;
        double result2 = x % y;
        double result3 = Math.sqrt(x);
        System.out.println("Dividing result x by y " + result);
        System.out.println("Remainder of the division x by y " + result2);
        System.out.println("Square root x " + result3);//refactor
    }
}
