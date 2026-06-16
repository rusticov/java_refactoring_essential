package com.codemanship.refactoring.divergentchange;

public class AccountStatusCalculator {

    public String statusSinceLastLogin(int daysSinceLastLogin) {
        if (daysSinceLastLogin > 365) {
            return "INACTIVE";
        } else if (daysSinceLastLogin > 30) {
            return "DORMANT";
        }
        return "ACTIVE";
    }
}