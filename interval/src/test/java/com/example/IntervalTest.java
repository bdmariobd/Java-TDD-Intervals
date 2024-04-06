package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntervalTest {
    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue() {
        assertTrue(new Interval(new OpenMin(-1.7), new OpenMax(5555.0)).include(0.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithExcludedValueThenFalse() {
        assertFalse(new Interval(new OpenMin(-1.7), new OpenMax(5555.0)).include(5555.1));
    }

    @Test
    public void givenIntervalwhenIncludeWithLimitValueThenFalse() {
        assertFalse(new Interval(new OpenMin(-1.7), new Max(5555.0)).include(5555.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithLimitLowerValueThenFalse() {
        assertFalse(new Interval(new Min(-1.7), new Max(5555.0)).include(-1.7));
    }

}
