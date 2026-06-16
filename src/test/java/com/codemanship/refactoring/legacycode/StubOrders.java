package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public class StubOrders implements Orders {

    private final Order order;

    public StubOrders(Order order) {
        this.order = order;
    }

    @Override
    public Order fetchOrder(int orderId) throws IOException, InterruptedException {
        if (order.getOrderId() == orderId) {
            return order;
        }
        throw new IOException("no order");
    }
}
