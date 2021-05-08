package com.itstep.module2.submodule1;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number n: ");
        double  n = scanner.nextFloat();
        if (n % 1 == 0) {
            System.out.println("The number is integer");
        }else{
            System.out.println("The number is not integer");

        }
    }
}
