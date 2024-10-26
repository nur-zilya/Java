//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Информация о системе");
        System.out.println("OC: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.println("Кол-во ядер: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Память доступная JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }
    }
