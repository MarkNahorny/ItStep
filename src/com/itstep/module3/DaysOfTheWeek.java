package com.itstep.module3;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        int days = scanner.nextInt();
        int week = 0;
        while (week <= 7) {
            week++;
            if (days == 1) {
                System.out.println("Monday: ");
                break;
            } else if (days == 2) {
                System.out.println("Tuesday: ");
                break;
            } else if (days == 3) {
                System.out.println("Wednesday: ");
                break;
            } else if (days == 4) {
                System.out.println("Thursday: ");
                break;
            } else if (days == 5) {
                System.out.println("Friday: ");
                break;
            } else if (days == 6) {
                System.out.println("Saturday: ");
                break;
            } else if (days == 7) {
                System.out.println("Sunday: ");
                break;
            }
        }
    }
}