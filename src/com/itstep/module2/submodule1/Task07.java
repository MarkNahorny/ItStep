package com.itstep.module2.submodule1;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of contribution i: ");
        float i = scanner.nextFloat();
        System.out.print("Enter the annual percentage p: ");
        float p = scanner.nextFloat();
        float year = 2;
        float result = i /100 *  p  * year + i;
        System.out.println("The amount of deposit in the bank through\n" +
                "two years =" + result);


    }
}
//S = i×(1+р/100)^Math.pow(year,2)
//        А - сумма вклада
//        р - процент
//        n - количество лет