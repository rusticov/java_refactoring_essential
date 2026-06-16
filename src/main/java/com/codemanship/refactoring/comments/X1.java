package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int z) {
        int p = 0;

        // Iterate from lower bound (lowerBound) to upper bound (z)
        p = sumSquaresBetweenBounds(lowerBound, z, p);

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
