package org.tyaa.solid;

public class Order {

    public Item[] items =
            new Item[]{new Item(), new Item(), new Item()};

    public String getCustomerName() {
        return null;
    }

    public String getCustomerEmail() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public Item[] getItems() {
        return items;
    }
}
