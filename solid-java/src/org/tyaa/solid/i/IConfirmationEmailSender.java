package org.tyaa.solid.i;

import org.tyaa.solid.Order;

public interface IConfirmationEmailSender {
    void sendConfirmationEmail(Order order);
}
