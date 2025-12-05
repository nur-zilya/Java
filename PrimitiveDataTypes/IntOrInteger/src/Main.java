public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for (int i = 0; i < 65536; i++) {
            if ((char)i == 'Ё' || (char)i == 'ё') {
                System.out.println((char)i);
            }
            else if ((char) i >= 'А' && (char) i <= 'я'){
                System.out.println((char)i);
            }

        }

    }
}
