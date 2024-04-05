package com.example;

public class Interval {
    private double lowerBound;
    private double upperBound;
    private boolean includeUpperBound;

    public Interval(double lowerBound, boolean includeLowerBound, double upperBound, boolean includeUpperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.includeUpperBound = includeUpperBound;
    }

    public boolean include(double d) {
        if (includeUpperBound)
            return lowerBound <= d && d <= upperBound;
        return lowerBound <= d && d < upperBound;
    }
}
