package com.itstep.module3;

import java.util.Scanner;

import static java.lang.System.*;

public class EnterTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter time from 1 to 24: ");
        int time = scanner.nextInt();
            if (time <= 3) out.println("Good night: ");
            else if (time <= 11) out.println("Good morning: ");
            else if (time <= 17) out.println("Good day: ");
            else if (time <= 21) out.println("Good evening: ");
            else if (time <= 24) out.println("Good night: ");
            else {
                out.print("Number is wrong - high than 24 ours: " + time);
            }
        }
    }
