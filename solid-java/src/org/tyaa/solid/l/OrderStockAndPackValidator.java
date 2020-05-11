package org.tyaa.solid.l;

import org.tyaa.solid.Item;
import org.tyaa.solid.Order;

public class OrderStockAndPackValidator extends OrderStockValidator {
    @Override
    public boolean isValid(Order order) throws Exception {
        for (Item item : order.getItems()) {
            if ( !item.isInStock() || !item.isPacked() ){
                // throw new Exception("Custom Exception Message");
                return false; // Don’t throw an Exception!
            }
        }
        return true;
    }
}
