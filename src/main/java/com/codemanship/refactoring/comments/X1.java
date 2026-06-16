package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int p = 0;

        p = sumSquaresBetweenBounds(lowerBound, upperBound, p);

        // Return accumulated sum
        return p;
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
