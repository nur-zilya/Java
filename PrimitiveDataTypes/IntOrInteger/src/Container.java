public class Container {
    private Integer count;

    public Container() {
        this.count = 0;
    }

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
