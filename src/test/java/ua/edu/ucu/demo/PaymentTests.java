package ua.edu.ucu.demo;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.demo.paymentstrategy.CreditCardPaymentStrategy;
import ua.edu.ucu.demo.paymentstrategy.PayPalPaymentStrategy;

import org.junit.jupiter.api.Assertions;

public class PaymentTests {
    @Test
public void testCardPay() {
    CreditCardPaymentStrategy creditCardPayment=new CreditCardPaymentStrategy();
    double price = 100.00; // Replace with the desired price
    String exp = "Trying to pay " + price + "$ by Credit card";
    String r = creditCardPayment.pay(price);
    Assertions.assertEquals(exp, r, "Payment message is incorrect");
}


    @Test
    public void testPaymentPay() {
    PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();
    double price = 0.0;
    String result = payPalPayment.pay(price);
    String expected = "Trying to pay " + price + "$ by PayPal card";
    Assertions.assertEquals(expected, result);
}
}