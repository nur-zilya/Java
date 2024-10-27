import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int res1 = 1;
        int i;

        for (i = 1; i <= value; i ++){
            res1 *= i;
            System.out.println(res1);
    }
        System.out.println(res1);
    }
}