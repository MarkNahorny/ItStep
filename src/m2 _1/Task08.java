import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        final double t = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sound speed: ");
        double s = scanner.nextDouble(); // meter per second
        double result = t * s;
        System.out.println("Distance to place = " + result + " metres");


    }
}

