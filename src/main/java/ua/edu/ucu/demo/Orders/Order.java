package ua.edu.ucu.demo.Orders;

import java.util.LinkedList;
import ua.edu.ucu.demo.PaymentStrategy.Payment;
import ua.edu.ucu.demo.DeliveryStrategy.Delivery;
import ua.edu.ucu.demo.Items.Item;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for(Item flower:items){
            total += flower.getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Preping the order";
    }

    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
}
