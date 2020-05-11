package org.tyaa.solid.i;

import org.tyaa.solid.Order;

public interface IMySQLOrderRepository {
    boolean save(Order order);
}
