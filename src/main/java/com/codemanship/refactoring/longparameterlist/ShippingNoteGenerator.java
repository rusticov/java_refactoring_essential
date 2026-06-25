package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
        Customer customer,
        Address shippingAddress,
        OrderItem orderItem) {

        String fullName = customer.fullName();

        String address = shippingAddress.formatOnSingleLine();

        return "SHIPPING NOTE\n"
                + "Order: " + orderItem.id() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + orderItem.itemDescription() + "\n"
                + "Quantity: " + orderItem.quantity();
    }

}
