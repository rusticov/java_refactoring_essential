package com.codemanship.refactoring.comments;

public class X1 {

    static int sumSquaresBetweenBounds(int lowerBound, int upperBound) {
        int result = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            result += square(i);
        }
        return result;
    }

    static int square(int k) {
        return k * k;
    }
}
