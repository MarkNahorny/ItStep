package com.itstep.module3;


import java.util.Scanner;

public class LatinCyrillic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        char choice = scanner.next(".").charAt(0);
        if (choice >= 'a' && choice <= 'z' || choice >= 'A' && choice <= 'Z') {
            System.out.println("Latin ");
        } else if (choice >= 'а' && choice <= 'я' || choice >= 'А' && choice <= 'Я') {
            System.out.println("Cyrillic ");
        } else if (choice <= 100 && choice > 100) {
            System.out.println("Number ");
        } else {
            System.out.println("Impossible to define ");
        }
    }
}
