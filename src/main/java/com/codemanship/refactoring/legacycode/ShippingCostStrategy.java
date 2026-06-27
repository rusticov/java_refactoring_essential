package com.codemanship.refactoring.legacycode;

public class ShippingCostStrategy {
    public double calculateOrderCost(Order order) {
        return switch (order.getShippingType()) {
            case "INTERNATIONAL" -> order.getWeightKg() * 1.5;
            default -> throw new RuntimeException(
                "Unknown shipping type: "
                    + order.getShippingType()
            );
        };
    }
}
