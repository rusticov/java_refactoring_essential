package com.codemanship.refactoring.legacycode.costStrategies;

import java.util.Map;

public class AvailableShippingCostStrategies {

    private static final Map<String, ShippingCostStrategy> availableStrategies = Map.of(
            "STANDARD", new StandardShippingCostStrategy(),
            "EXPRESS", new ExpressShippingCostStrategy(),
            "OVERNIGHT", new OvernightShippingCostStrategy(),
            "INTERNATIONAL", new InternationalShippingCostStrategy()
    );

    public static ShippingCostStrategy forShippingType(String shippingType) {
        if (availableStrategies.containsKey(shippingType)) {
            return availableStrategies.get(shippingType);
        }
        throw new RuntimeException("Unknown shipping type: " + shippingType);
    }
}
