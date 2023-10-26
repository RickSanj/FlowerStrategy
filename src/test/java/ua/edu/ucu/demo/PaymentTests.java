package ua.edu.ucu.demo;

import ua.edu.ucu.demo.PaymentStrategy.CreditCardPaymentStrategy;
import ua.edu.ucu.demo.PaymentStrategy.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTests {
    @Test
    public void testCardPay() {
        CreditCardPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        double price = 100.00; // Replace with the desired price
        String result = creditCardPayment.pay(price);
        String expected = "Trying to pay " + price + "$ by Credit card";
        assertEquals(expected, result);
    }

    @Test
    public void testPaymentPay() {
    PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();
    double price = 0.0;
    String result = payPalPayment.pay(price);
    String expected = "Trying to pay " + price + "$ by PayPal card";
    assertEquals(expected, result);
}
}