package com.itstep.module3;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter number y: ");
        double y = scanner.nextDouble();
        if (x % 2 == 0 && y % 2 == 0 || x % 2 != 0 && y % 2 != 0) {
            System.out.println("Yes ");
        }else{
        }
    }
}
//    Scanner scanner = new Scanner(System.in);            The second option for solving the task....
//        System.out.print("Enter number x: ");
//                double x = scanner.nextDouble();
//                System.out.print("Enter number y: ");
//                double y = scanner.nextDouble();
//                boolean even = (x % 2 == 0 && y % 2 == 0);
//                boolean odd = (x % 2 != 0 && y % 2 != 0);
//                if (even || odd) {
//                System.out.println("Yes ");
//                }else{
//                }
//                }
//                }