package com.itstep.module3;

import java.util.Scanner;

public class HappyNumberOrNo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = console.nextInt();
        int[] array = new int[6];
        for (int i = 0; i <= 5; i++) {
            array[i] = a % 10;
            a = a / 10;
        }
        int s1 = array[0] + array[1] + array[2];
        int s2 = array[3] + array[4] + array[5];
        if (s1 == s2) {
            System.out.println("Happy number ");
        } else {
            System.out.println("Unhappy number ");
        }
    }

}
