package com.codemanship.refactoring.legacycode.costStrategies;

import com.codemanship.refactoring.legacycode.Order;

class OvernightShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 1.2 + 25;
    }
}
