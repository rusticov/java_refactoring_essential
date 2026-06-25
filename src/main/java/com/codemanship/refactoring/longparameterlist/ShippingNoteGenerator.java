package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
        Customer customer,
        Address shippingAddress, String orderId,
        String itemDescription,
        int quantity
    ) {
        String fullName = customer.firstName() + " " + customer.lastName();

        String address = shippingAddress.addressLine1() + ", "
                + (shippingAddress.addressLine2() != null ? shippingAddress.addressLine2() + ", " : "")
                + shippingAddress.city() + ", "
                + shippingAddress.postcode() + ", "
                + shippingAddress.country();

        return "SHIPPING NOTE\n"
                + "Order: " + orderId + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + itemDescription + "\n"
                + "Quantity: " + quantity;
    }
}
