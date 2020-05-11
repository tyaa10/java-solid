package org.tyaa.solid.o;

import org.tyaa.solid.Order;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing();
        super.process(order);
        afterProcessing();
    }
    private void beforeProcessing() {}
    private void afterProcessing() {}

}
