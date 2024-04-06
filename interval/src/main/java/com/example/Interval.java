package com.example;

public class Interval {
    private Min min;
    private Max max;

    public Interval(Min min, Max max) {
        this.min = min;
        this.max = max;
    }

    public boolean include(double d) {
        return min.lessThan(d) && max.greaterThan(d);
    }
}
