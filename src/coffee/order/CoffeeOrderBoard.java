package coffee.order;

import java.util.TreeMap;


public class CoffeeOrderBoard {

    private TreeMap<Integer, String> orders;

    public CoffeeOrderBoard() {
        this.orders = new TreeMap<>();
    }

    public static void add(Order order, CoffeeOrderBoard ordersBoard) {
        ordersBoard.orders.put(order.getOrderNumber(), order.getCustomerName());

    }

    public static void deliver(CoffeeOrderBoard ordersBoard) {
        ordersBoard.orders.remove(ordersBoard.orders.lastKey());
    }

    public static void deliver(CoffeeOrderBoard ordersBoard, Integer orderNumber) {
        ordersBoard.orders.remove(orderNumber);
    }

    public static void draw(CoffeeOrderBoard ordersBoard) {
        System.out.println("Num | Name");
        for (Integer orderNumber : ordersBoard.orders.keySet()) {
            System.out.println(orderNumber + " | " + ordersBoard.orders.get(orderNumber));
        }
    }

}
