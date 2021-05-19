package com.itstep.module3;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Choose an animal:
                1-Cat,
                2-Wolf,
                3-Cow,
                4-Chicken,
                5-Dog,
                6-Crocodile,
                7-Mouse,
                8-Eagle,
                9-Monkey,
                10-Cobra...\s""");
        int animal = scanner.nextInt();
        switch (animal) {
            case (1)-> System.out.print("Miyau");
            case (2)-> System.out.print("Haooo");
            case (3)-> System.out.print("Moooo");
            case (4)-> System.out.print("KoKoKo");
            case (5)-> System.out.print("HauHau");
            case (6)-> System.out.print("Rrrraaaaa");
            case (7)-> System.out.print("Pipipi");
            case (8)-> System.out.print("Tiu");
            case (9)-> System.out.print("ChaChaCha");
            case (10)-> System.out.print("Tsssss");
        }
    }
}
