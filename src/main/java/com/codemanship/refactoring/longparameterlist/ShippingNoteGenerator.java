package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
        Customer customer,
        Address shippingAddress,
        OrderItem orderItem) {

        String fullName = customer.fullName();

        String address = formatAddressOnSingleLine(shippingAddress);

        return "SHIPPING NOTE\n"
                + "Order: " + orderItem.id() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + orderItem.itemDescription() + "\n"
                + "Quantity: " + orderItem.quantity();
    }

    private static String formatAddressOnSingleLine(Address shippingAddress) {
        return shippingAddress.line1() + ", "
            + (shippingAddress.line2() != null ? shippingAddress.line2() + ", " : "")
            + shippingAddress.city() + ", "
            + shippingAddress.postcode() + ", "
            + shippingAddress.country();
    }

}
