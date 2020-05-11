package org.tyaa.solid.i;

import org.tyaa.solid.Order;

public class ConfirmationEmailSender implements IConfirmationEmailSender {
    @Override
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
    }
}
