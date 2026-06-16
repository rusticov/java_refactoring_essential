package com.codemanship.refactoring.divergentchange;

public class CustomerNameFormatter {
    public CustomerNameFormatter() {
    }

    public String formatDisplayName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }
}