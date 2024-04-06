package com.example;

public class Max {
    
    double number;

    public Max(double number, boolean include) {
        this.number = number;
    }

    public boolean greaterThan(double valueToCompare) {
        return this.number >= valueToCompare;
    }
}
