package com.example;

public class Interval {
    private double lowerBound;
    private double upperBound;
    public Interval(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean include(double d) {
        return lowerBound <= d && d <= upperBound;
    }
}
