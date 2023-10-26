package ua.edu.ucu.demo.PaymentStrategy;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Trying to pay " + price + "$ by Credit card";
    }
}
