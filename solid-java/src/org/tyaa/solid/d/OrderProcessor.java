package org.tyaa.solid.d;

import org.tyaa.solid.Order;

public class OrderProcessor {
    public void process(Order order, IMainProcess mainProcess){
        // order processed (option 1)
        // order processed (option 2)
        System.out.println("before");
        mainProcess.work(order);
        // System.out.println(order + " order processed");
        System.out.println("after");
    }
}
