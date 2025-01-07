package coffee.order;

public class Order {
    private final int orderNumber;
    private final String customerName;

    public Order(String name, Integer orderNumber) {
        this.customerName = name;
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

}
