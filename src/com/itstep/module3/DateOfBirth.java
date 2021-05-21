package com.itstep.module3;

import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date of birth: \n1-day,\n2-month,\n3-year.");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (day >= 21 && day <= 31 && month == 3 || day >= 1 && day <= 19 && month == 4) {
            System.out.println("Sign: Aries ");
        } else if (day >= 21 && day <= 30 && month == 4 || day >= 1 && day <= 20 && month == 5) {
            System.out.println("Sign: Calf");
        } else if (day >= 21 && day <= 31 && month == 5 || day >= 1 && day <= 20 && month == 6) {
            System.out.println("Sign: Twins ");
        } else if (day >= 21 && day <= 30 && month == 6 || day >= 1 && day <= 22 && month == 7) {
            System.out.println("Sign: Cancer");
        } else if (day >= 23 && day <= 31 && month == 7 || day >= 1 && day <= 22 && month == 8) {
            System.out.println("Sign: Lion");
        } else if (day >= 23 && day <= 31 && month == 8 || day >= 1 && day <= 22 && month == 9) {
            System.out.println("Sign: Virgo");
        } else if (day >= 23 && day <= 30 && month == 9 || day >= 1 && day <= 22 && month == 10) {
            System.out.println("Sign: Libra");
        } else if (day >= 23 && day <= 31 && month == 10 || day >= 1 && day <= 21 && month == 11) {
            System.out.println("Sign: Scorpion");
        } else if (day >= 22 && day <= 30 && month == 11 || day >= 1 && day <= 21 && month == 12) {
            System.out.println("Sign: Sagittarius");
        } else if (day >= 22 && day <= 31 && month == 12 || day >= 1 && day <= 19 && month == 1) {
            System.out.println("Sign: Capricorn");
        } else if (day >= 20 && day <= 31 && month == 1 || day >= 1 && day <= 18 && month == 2) {
            System.out.println("Sign: Aquarius");
        } else if (day >= 19 && day <= 28 && month == 2 || day >= 1 && day <= 20 && month == 3) {
            System.out.println("Sign: Pisces");
        }
        int chin = year % 12;
        switch (chin) {
            case 0 -> System.out.println(" year: Monkey");
            case 1 -> System.out.println(" year: Rooster");
            case 2 -> System.out.println(" year: Dog");
            case 3 -> System.out.println(" year: Pig");
            case 4 -> System.out.println(" year: Rat");
            case 5 -> System.out.println(" year: Bull");
            case 6 -> System.out.println(" year: Tiger");
            case 7 -> System.out.println(" year: Rabbit");
            case 8 -> System.out.println(" year: Dragon");
            case 9 -> System.out.println(" year: Snakes");
            case 10 -> System.out.println(" year: Horse");
            case 11 -> System.out.println(" year: Goats");
            default -> System.out.println("Wrong format entering the year of birth (XXXX)");
            }
        }
    }


