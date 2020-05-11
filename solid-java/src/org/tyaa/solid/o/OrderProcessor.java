package org.tyaa.solid.o;

import org.tyaa.solid.Order;

public class OrderProcessor {
    protected void process(Order order) {
        System.out.println(order + " order processed");
    }
}
