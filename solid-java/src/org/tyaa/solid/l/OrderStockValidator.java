package org.tyaa.solid.l;

import org.tyaa.solid.Item;
import org.tyaa.solid.Order;

public class OrderStockValidator {
    public boolean isValid(Order order) throws Exception {
        for (Item item : order.getItems()) {
            if (! item.isInStock()) {
                return false;
            }
        }
        return true;
    }
}
