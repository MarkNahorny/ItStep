package com.itstep.module2.submodule1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int time = scanner.nextInt();
        int day = time / 24 / 3600;
        int hours = time / 3600 - day * 24;
        int min = time / 60 - hours * 3600;
        int sec = time - min * 60 - hours * 3600;
        System.out.print("Days" + day + " Hours" + hours
                + " Minutes" + min + " Seconds" +sec );
    }
}
