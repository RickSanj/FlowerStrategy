package ua.edu.ucu.demo.paymentstrategy;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Trying to pay " + price + "$ by Credit card";
    }
}
