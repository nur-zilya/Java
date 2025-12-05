public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 500);
        basket.add("Bread", 30, 1, 200);
        basket.print("");
        Basket basket2 = new Basket();
        basket2.add("Pepsi", 80, 2, 250);
        basket2.print("");
    }
}