package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
        Customer customer,
        Address shippingAddress,
        OrderItem orderItem) {
        String fullName = customer.firstName() + " " + customer.lastName();

        String address = shippingAddress.line1() + ", "
                + (shippingAddress.line2() != null ? shippingAddress.line2() + ", " : "")
                + shippingAddress.city() + ", "
                + shippingAddress.postcode() + ", "
                + shippingAddress.country();

        return "SHIPPING NOTE\n"
                + "Order: " + orderItem.orderId() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + orderItem.itemDescription() + "\n"
                + "Quantity: " + orderItem.quantity();
    }
}
