import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int value = new Scanner(System.in).nextInt();
            for (int i = 1; i <= value; i++){
                for (int j = value; j > 0; j--){
                    if (i * j == value) {
                        System.out.println(i + "*" + j);
                    }
                }
            }
        }
    }
}