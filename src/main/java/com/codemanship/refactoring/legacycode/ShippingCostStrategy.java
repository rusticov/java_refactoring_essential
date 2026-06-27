package com.codemanship.refactoring.legacycode;

public class ShippingCostStrategy {
    public double calculateOrderCost(Order order) {
        throw new RuntimeException("Unknown shipping type: "+ order.getShippingType());
    }
}
