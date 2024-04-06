package com.example;

public class Max {
    double number;
    boolean include;
    public Max(double number, boolean include) {
        this.number = number;
        this.include = include;
    }

    public boolean greaterThan(double valueToCompare) {
        if (include) {
            return valueToCompare <= number;
        }
        return valueToCompare < number;
    }
}
