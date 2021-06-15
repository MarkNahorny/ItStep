package com.itstep.module4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter figure height: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == height || i == height - 1 || j == height - i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }}
