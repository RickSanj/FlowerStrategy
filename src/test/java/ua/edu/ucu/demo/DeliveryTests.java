package ua.edu.ucu.demo;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.demo.deliverystrategy.DHLDeliveryStrategy;
import ua.edu.ucu.demo.deliverystrategy.PostDeliveryStrategy;

import org.junit.jupiter.api.Assertions;


public class DeliveryTests {
    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        Assertions.assertEquals("Items were delivered by DHL!", dhlDelivery.deliver());
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        String result = postDelivery.deliver();
        Assertions.assertEquals("Items were delivered by post!", result);
    }
}

