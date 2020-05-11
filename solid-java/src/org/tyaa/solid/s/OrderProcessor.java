package org.tyaa.solid.s;

import org.tyaa.solid.Order;

public class OrderProcessor {
    public void process(Order order){
        MySQLOrderRepository repository = new MySQLOrderRepository();
        ConfirmationEmailSender mailSender = new ConfirmationEmailSender();
        if (order.isValid() && repository.save(order)) {
            mailSender.sendConfirmationEmail(order);
            System.out.println(order + " order processed");
        }
    }
}
