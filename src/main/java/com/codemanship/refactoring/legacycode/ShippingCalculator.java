package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

    private final Orders orders;

    public ShippingCalculator(Orders orders) {
        this.orders = orders;
    }

    public double calculateShipping(int orderId) {

        try {
            Order order = orders.fetchOrder(orderId);

            double weight = order.getWeightKg();

            return switch (order.getShippingType()) {
                case "STANDARD" -> weight * 0.5;
                case "EXPRESS" -> weight * 0.8
                    + order.getDistanceKm() * 0.1;
                case "OVERNIGHT" -> weight * 1.2 + 25;
                case "INTERNATIONAL" -> weight * 1.5;
                default -> throw new RuntimeException(
                    "Unknown shipping type: "
                        + order.getShippingType()
                );
            };

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
