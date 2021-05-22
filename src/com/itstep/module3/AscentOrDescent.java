package com.itstep.module3;

import java.util.Scanner;

public class AscentOrDescent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first point (x1 and y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter second point (x2 and y2) ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        boolean sum = Math.abs(x2) == Math.abs(x1) && y2 == y1;
        boolean sum2 = x1 != x2 && y1 == y2;
        if ((x1 < x2) && (y1 < y2)) {
            System.out.println("Подъём");
        } else if ((x1 > x2) && (y1 < y2)) {
            System.out.println("Подъём");
        } else if ((x1 < x2) && (y1 > y2)) {
            System.out.println("Спуск");
        } else if ((x1 > x2) && (y1 > y2)) {
            System.out.println("Спуск");
        } else if ((x1 == x2) && (y1 > y2)) {
            System.out.println("Отвесный спуск");
        } else if ((x1 == x2) && (y1 < y2)) {
            System.out.println("отвесный подъём");
        } else if (sum && sum2) {
            System.out.println("Дорога ровная");
        } else if (sum2) {
            System.out.println("Дорога ровная");
        } else if (x1 == x2 && y1 == y2) {
            System.out.println("Дороги не существует");
        }
    }
}
