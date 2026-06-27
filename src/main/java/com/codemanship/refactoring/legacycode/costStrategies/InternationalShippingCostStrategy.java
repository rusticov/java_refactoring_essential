package com.codemanship.refactoring.legacycode.costStrategies;

import com.codemanship.refactoring.legacycode.Order;

class InternationalShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 1.5;
    }
}
