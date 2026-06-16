package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {

        // Return accumulated sum
        return sumSquaresBetweenBounds(lowerBound, upperBound, 0);
    }

    private static int sumSquaresBetweenBounds(int q, int z, int p) {
        for (int i = q; i <= z; i++) {
            // Add square of each number in the range
            p += square(i);
        }
        return p;
    }

    static int square(int k) {
        return k * k;
    }
}
