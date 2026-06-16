package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    private final EmailValidator emailValidator = new EmailValidator();
    private final CustomerNameFormatter customerNameFormatter = new CustomerNameFormatter();
    private final AccountStatusCalculator accountStatusCalculator = new AccountStatusCalculator();

    public boolean isValidEmail(String email) {
        return emailValidator.isValidEmail(email);
    }

    public String formatDisplayName(String firstName, String lastName) {
        return customerNameFormatter.format(firstName, lastName);
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return numberOfPurchases * 10;
    }

    public String determineAccountStatus(int daysSinceLastLogin) {
        return accountStatusCalculator.statusSinceLastLogin(daysSinceLastLogin);
    }
}
