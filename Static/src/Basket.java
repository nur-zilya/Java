public class Basket {

    private static int count = 0;
    private String items = "";
    private double totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalCount = 0;
    private static double totalPriceAllBaskets = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, double totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseTotalCount(int count){
        totalCount += count;
    }

    public static void increaseTotalPrice(double totalPrice){
        totalPriceAllBaskets += totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;

        double addedPrice = count * price;
        totalPrice += addedPrice;
        increaseTotalCount(count);
        increaseTotalPrice(addedPrice);
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);

        totalWeight += count * weight;
        totalCount += count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {return totalWeight;}

    public static double averageProductPrice() {
        if (totalCount == 0) {
            return 0;
        }
        return totalPriceAllBaskets / totalCount;
    }

    public static double averageBasketPrice() {
        if (count == 0) {
            return 0;
        }
        return  totalPriceAllBaskets / count;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общий вес: " + totalWeight);
            System.out.println("Общее кол-во во всех корзинах: " + totalCount);
            System.out.println("Общая цена корзины: " + totalPrice);
            System.out.println("Общая цена всех корзин: " + totalPriceAllBaskets);
            System.out.println("Средняя цена товара во всех корзинах: " + averageProductPrice());
            System.out.println("Количество корзин: " + count);
            System.out.println("Средняя стоимость корзины: " + averageBasketPrice());
        }
    }
}
