package com.codemanship.refactoring.longparameterlist;

public record Customer(String firstName, String lastName) {
    String fullName() {
        return firstName() + " " + lastName();
    }
}