import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter height: ");
        double height = scanner.nextDouble();
        double resultWeight = height - 110;
        System.out.println("Your ideal weight is: " + resultWeight);
        if (weight > resultWeight) {
            System.out.print("You need to throw weight: " + (weight - resultWeight) + " kg");
        }else if (weight < resultWeight) {
            System.out.print("You need to grow weight: " + (resultWeight - weight) + " kg");
        } else {
            System.out.print("Your weight is ideal: ");
        }
    }
}
