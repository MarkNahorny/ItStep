package com.itstep.module3;

import java.util.Scanner;

public class EntranceNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of flat: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of flat on the flor: ");
        int m = scanner.nextInt();
        System.out.println((n / (m * 9) + 1) + "-st entrance");
    }
}

