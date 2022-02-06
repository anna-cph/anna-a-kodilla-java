package challenges.food2door;

public class Shop {
    private String name;
    private int orderedAmount;

    public Shop(String name, int orderedAmount) {

        this.name = name;
        this.orderedAmount = orderedAmount;
    }

    public String getName() {
        return name;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }
}
