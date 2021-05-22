package com.itstep.module3;

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient a");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c");
        double c = scanner.nextDouble();
        double d = (b * b) - (4 * a * c);
        double two_roots1 = ((-b + (Math.sqrt(d))) / 2 * a);
        double two_roots2 = ((-b - (Math.sqrt(d))) / 2 * a);
        if (d > 0) {
            System.out.println("First root" + two_roots1 + '\n' + "Second root " + two_roots2);
        } else if (d < 0) {
            System.out.println("No root");
        } else if (d == 0) {
            System.out.println(two_roots1);
        }
    }
}


