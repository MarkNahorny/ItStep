import java.util.Scanner;

public class Task12 {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите номер условия (1,2,3): ");
                int task = in.nextInt();
                System.out.print("Введите кол учеников : ");
                int students = in.nextInt();
                System.out.printf("Номер условия: %d, Количество учеников: %d ", task, students);
                int pirozkov = 0;
                int milk = 0;
                if (task == 1){
                    pirozkov = 2*students;
                    milk = (int) Math.ceil((0.2*students)/0.9);
                }else if(task == 2){
                    if(Math.ceil(0.6*students) == (0.6*students)){
                        pirozkov = (int) (1.6*students);
                        milk = (int) Math.ceil((0.12*students)/0.9);
                    }else{
                        System.out.printf("Недостаточное количество учеников для 60 процентов");
                        return;
                    }
                }else if(task == 3) {
                    if(Math.ceil(0.01*students) == (0.01*students)){
                        pirozkov = (int) (1.01*students);
                        milk = (int) Math.ceil((0.002*students)/0.9);
                    }else{
                        System.out.printf("Недостаточное количество учеников для 1 процента");
                        return;
                    }
                }else {
                    System.out.printf("Введите правильное условие (1, 2, 3)");
                    return;
                }
                System.out.printf("Пирожков: %d, Молока: %d ", pirozkov, milk);
                in.close();

            }
        }