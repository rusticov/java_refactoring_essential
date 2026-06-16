package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int q, int z) {
        int p = 0;

        // Iterate from lower bound (q) to upper bound (z)
        for (int i = q; i <= z; i++) {
            // Add square of each number in the range
            p += square(i);
        }

        // Return accumulated sum
        return p;
    }

    static int square(int k) {
        return k * k;
    }
}
