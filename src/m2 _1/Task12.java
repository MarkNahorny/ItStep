import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учащихся 1 класса ");
        int pupils = scanner.nextInt();
        System.out.println("Введите количество учащихся, которые весят меньше 30 кг ");
        int pupilsHigh30 = scanner.nextInt();
        int p = pupilsHigh30 * 100 / pupils;
        if (p == 100) {
            System.out.println("Все учащиеся весят меньше 30 кг");
            int a = pupils * 2;
            double cakes = (pupils * 200) / 900d;
            int milkPack = (int) cakes;
            if (cakes == milkPack) {
                System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + milkPack);
            } else {
                milkPack += 1;
                System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + milkPack);
            }
        }
        System.out.println(pupils);
        System.out.println(pupilsHigh30);
        System.out.println(p);
        if (p == 60) {
            System.out.println("60% учащихся весят меньше 30 кг");
            int a = pupilsHigh30 * 2 + (pupils - pupilsHigh30); // считаю количество пирожков double b = (y * 200) / 900d;
            // считаю число пакетов молока int c = (int) b;
            // if (b == c) { System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + c);
            // } else { c += 1; System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + c);
            // } } if (p == 1) { System.out.println("1% учащихся весят меньше 30 кг");
            // int a = y * 2 + (x - y);
            // считаю количество пирожков double b = (y * 200) / 900d; // считаю число пакетов молока int c = (int) b;
            // if (b == c) { System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + c);
            // } else { c += 1; System.out.println("Необходимо пирожков: " + a + "\nНеобходимо пакетов молока: " + c); } } }}
        }
    }
}