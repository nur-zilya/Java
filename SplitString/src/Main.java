import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()){
            System.out.println("Введите ФИО!");
        }
        String space = " ";
        int firstSpace = input.indexOf(space);
        int start = firstSpace + 1;
        int secondSpace= input.lastIndexOf(space);
        int start2 = secondSpace + 1;
        int end = input.length();

        String surname = input.substring(0, firstSpace);
        System.out.println("Фамилия: " + surname);
        String name = input.substring(start, secondSpace);
        System.out.println("Имя: " + name);
        String patronim = input.substring(start2, end);
        System.out.println("Отчество: " + patronim);

    }
}