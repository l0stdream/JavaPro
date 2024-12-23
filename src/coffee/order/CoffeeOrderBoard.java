package coffee.order;

import java.util.*;


public class CoffeeOrderBoard {

    private int orderNumber = 1;
    List<Order> orders = new LinkedList<>();


    public void add(String name) {
        orders.add(new Order(name, orderNumber++));
    }

    public void deliver() {
        orders.removeFirst();
    }

    public void deliver(Integer orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                orders.remove(i);
            }
        }
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order currentOrder : orders) {
            System.out.println(currentOrder.getOrderNumber() + " | " + currentOrder.getCustomerName());
        }
    }

}
