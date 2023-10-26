package ua.edu.ucu.demo;

import ua.edu.ucu.demo.DeliveryStrategy.DHLDeliveryStrategy;
import ua.edu.ucu.demo.DeliveryStrategy.PostDeliveryStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTests {
    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        String result = dhlDelivery.deliver();
        assertEquals("Items were delivered by DHL!", result);
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        String result = postDelivery.deliver();
        assertEquals("Items were delivered by post!", result);
    }
}

