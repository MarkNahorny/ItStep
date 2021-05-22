package com.itstep.module3;

import java.util.Scanner;

public class DaysPerYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of years: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("366 days per year");
        } else {
            System.out.println("365 days per year");
        }
    }
}