package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
        Customer customer,
        Address shippingAddress,
        OrderItem orderItem) {

        String fullName = fullName(customer);

        String address = shippingAddress.line1() + ", "
                + (shippingAddress.line2() != null ? shippingAddress.line2() + ", " : "")
                + shippingAddress.city() + ", "
                + shippingAddress.postcode() + ", "
                + shippingAddress.country();

        return "SHIPPING NOTE\n"
                + "Order: " + orderItem.id() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + orderItem.itemDescription() + "\n"
                + "Quantity: " + orderItem.quantity();
    }

    private static String fullName(Customer customer) {
        return customer.firstName() + " " + customer.lastName();
    }
}
