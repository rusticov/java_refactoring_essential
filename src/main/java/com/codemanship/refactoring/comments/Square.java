package com.codemanship.refactoring.comments;

public class Square {

    static int sumOfSquaresBetweenBounds(int lowerBound, int upperBound) {
        int result = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            result += square(i);
        }
        return result;
    }

    static int square(int value) {
        return value * value;
    }
}
