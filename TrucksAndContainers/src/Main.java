import java.util.Scanner;


public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int boxes = Integer.parseInt(scanner.nextLine());

        TrucksAndContainers(boxes);
    }

    private static void TrucksAndContainers(int boxes) {

        if (boxes <= 0) {
            System.out.println("Некорректное кол-во коробок!");
            return;
        }

        int containers = (boxes + 27 - 1) / 27;
        int trucks = (containers + 12 - 1) / 12;

        int currentBox = 1;

        for (int t = 1; t <= trucks; t++) {
            System.out.println("Грузовик: " + t);
            for (int c = 1; c <= 12 && (c + (t - 1) * 12) <= containers; c++) {
                int containerNumber = (c + (t - 1) * 12);
                System.out.println("Контейнер: " + containerNumber);
                for (int b = 1; b <= 27 && currentBox <= boxes; b++) {
                    System.out.println("\t\tЯщик: " + currentBox);
                    currentBox++;
                }
            }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");
    }
}