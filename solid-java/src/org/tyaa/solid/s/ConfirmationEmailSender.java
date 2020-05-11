package org.tyaa.solid.s;

import org.tyaa.solid.Order;

public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
    }
}
