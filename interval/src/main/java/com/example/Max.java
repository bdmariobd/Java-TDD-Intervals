package com.example;

public class Max {
    double number;
    public Max(double number) {
        this.number = number;
    }

    public boolean greaterThan(double valueToCompare) {
        return number > valueToCompare;
    }
}
