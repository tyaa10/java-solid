package org.tyaa.solid.s;

import org.tyaa.solid.Order;

public class MySQLOrderRepository {
    public boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // save an order to DB
        return true;
    }
}
