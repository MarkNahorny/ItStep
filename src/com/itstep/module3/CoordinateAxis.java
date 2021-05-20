package com.itstep.module3;

public class CoordinateAxis {
    public static void main(String[] args) {
        int x = 2;
        int y = -5;
        if (x > 0 && x <= 10 && y > 0 && y <= 10)
            System.out.println("First axis: ");
        else if (x < 0 && x >= -10 && y > 0 && y <= 10)
            System.out.println("Second axis: ");
        else if (x < 0 && x >= -10 && y < 0 && y >= -10)
            System.out.println("Third axis: ");
        else if (x > 0 && x <= 10 && y < 0 && y >= -10)
            System.out.println("Forth axis: ");
        else
            System.out.println("Not in coordinate axis: ");
    }
}
