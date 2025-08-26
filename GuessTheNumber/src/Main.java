import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        while(true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt < number){
                System.out.println("Загаданное число больше");
            }
            else if (attempt > number){
                System.out.println("Загаданное число меньше");
            }
            else {
                System.out.println("Вы угадали");
            }
        }
    }
}