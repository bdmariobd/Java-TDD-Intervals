package com.example;

public class Interval {
    private double lowerBound;
    private boolean includeLowerBound;
    private double upperBound;
    private boolean includeUpperBound;

    public Interval(double lowerBound, boolean includeLowerBound, double upperBound, boolean includeUpperBound) {
        this.lowerBound = lowerBound;
        this.includeLowerBound = includeLowerBound;
        this.upperBound = upperBound;
        this.includeUpperBound = includeUpperBound;
    }

    public boolean include(double d) {
        if (d < lowerBound || d > upperBound) {
            return false;
        }
        if (d == lowerBound) {
            return includeLowerBound;
        }
        if (d == upperBound) {
            return includeUpperBound;
        }
        return true;
    }
}
