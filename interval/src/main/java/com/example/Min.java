package com.example;

public class Min {
    double number;

    public Min(double number) {
        this.number = number;
    }

    public boolean lessThan(double valueToCompare) {
        return number < valueToCompare;
    }
}
