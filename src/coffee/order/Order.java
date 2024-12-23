package coffee.order;

public class Order {
    private static int counter;
    private int orderNumber;
    private String customerName;

    public Order(String name) {
        this.customerName = name;
        orderNumber = ++counter;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

}
