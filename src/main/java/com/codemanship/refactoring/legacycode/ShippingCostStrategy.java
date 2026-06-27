package com.codemanship.refactoring.legacycode;

public class ShippingCostStrategy {
    protected double calculateOrderCost(Order order) {
        return switch (order.getShippingType()) {
            case "STANDARD" -> order.getWeightKg() * 0.5;
            case "EXPRESS" -> order.getWeightKg() * 0.8
                + order.getDistanceKm() * 0.1;
            case "OVERNIGHT" -> order.getWeightKg() * 1.2 + 25;
            case "INTERNATIONAL" -> order.getWeightKg() * 1.5;
            default -> throw new RuntimeException(
                "Unknown shipping type: "
                    + order.getShippingType()
            );
        };
    }
}
