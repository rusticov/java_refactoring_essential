package com.codemanship.refactoring.legacycode;

public class AvailableShippingCostStrategies {
    static ShippingCostStrategy createCostStrategy(String shippingType) {
        return switch (shippingType) {
            case "STANDARD" -> new StandardShippingCostStrategy();
            case "EXPRESS" -> new ExpressShippingCostStrategy();
            case "OVERNIGHT" -> new OvernightShippingCostStrategy();
            case "INTERNATIONAL" -> new InternationalShippingCostStrategy();
            default -> throw new RuntimeException("Unknown shipping type: " + shippingType);
        };
    }
}
