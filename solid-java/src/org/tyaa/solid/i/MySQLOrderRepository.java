package org.tyaa.solid.i;

import org.tyaa.solid.Order;

public class MySQLOrderRepository implements IMySQLOrderRepository {
    @Override
    public boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // save an order to DB
        return true;
    }
}
