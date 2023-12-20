package ua.edu.ucu.demo.paymentstrategy;

public class PayPalPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Trying to pay " + price + "$ by PayPal card";
    }
}
