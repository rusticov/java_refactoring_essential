package com.codemanship.refactoring.legacycode.costStrategies;

import com.codemanship.refactoring.legacycode.Order;

public interface ShippingCostStrategy {
    double calculateOrderCost(Order order);
}
