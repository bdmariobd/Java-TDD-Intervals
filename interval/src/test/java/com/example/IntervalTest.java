package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntervalTest {
    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue() {
        assertTrue(new Interval(-1.7, true, 5555.0, true).include(0.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithExcludedValueThenFalse() {
        assertFalse(new Interval(-1.7, true, 5555.0, true).include(5555.1));
    }

    @Test
    public void givenIntervalwhenIncludeWithLimitValueThenFalse() {
        assertFalse(new Interval(-1.7, true, 5555.0, false).include(5555.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithLimitLowerValueThenFalse() {
        assertFalse(new Interval(-1.7, false, 5555.0, false).include(-1.7));
    }

}
