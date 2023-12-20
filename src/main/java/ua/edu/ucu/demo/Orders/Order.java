package ua.edu.ucu.demo.orders;

import java.util.LinkedList;

import ua.edu.ucu.demo.deliverystrategy.Delivery;
import ua.edu.ucu.demo.items.Item;
import ua.edu.ucu.demo.paymentstrategy.Payment;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment val) {
        this.payment = val;
    }

    public void setDeliveryStrategy(Delivery val) {
        this.delivery = val;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item flower:items) {
            total += flower.getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Preping the order";
    }

    public void addItem (Item item) {
        items.add(item);
    }
    
    public void removeItem (Item item) {
        items.remove(item);
    }
}
