package info.parthshah.examples.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.itemLookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process(){
        for(Order order: orders){
            order.processOrder();
            orders.remove(order);
        }
    }

    String report(){
        return "Total item objects made: " + catalog.totalItemsMade();
    }
}
