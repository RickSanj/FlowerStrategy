package ua.edu.ucu.demo.deliverystrategy;


public class PostDeliveryStrategy implements Delivery {
    public String deliver() {
        return "Items were delivered by post!";
    }
}
