package com.example;

public class Min {
    double number;
    boolean include;
    public Min(double number, boolean include) {
        this.number = number;
        this.include = include;
    }

    public boolean lessThan(double valueToCompare) {
        if (include) {
            return valueToCompare >= number;
        }
        return valueToCompare > number;
    }
}
