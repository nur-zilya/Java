import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int wordCounter = 1;
        int start = 0;
        StringBuilder sb = new StringBuilder();

        while (true){
            int spaceIndex = input.indexOf(' ', start);

            if (spaceIndex == -1) {
                break;
            }


            String word = input.substring(start, spaceIndex);
            sb.append("(").append(wordCounter).append(") ").append(word).append(" ");
            wordCounter++;
            start = spaceIndex +1;
        }
        String lastWord = input.substring(start);
        sb.append("(").append(wordCounter).append(") ").append(lastWord);

        System.out.println(sb);
    }
}