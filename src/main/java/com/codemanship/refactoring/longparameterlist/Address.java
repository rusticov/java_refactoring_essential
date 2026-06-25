package com.codemanship.refactoring.longparameterlist;

public record Address(String line1, String line2, String city, String postcode, String country) {

    String formatAddressOnSingleLine() {
        return line1() + ", "
            + (line2() != null ? line2() + ", " : "")
            + city() + ", "
            + postcode() + ", "
            + country();
    }
}