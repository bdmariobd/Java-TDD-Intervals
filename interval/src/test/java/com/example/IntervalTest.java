package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntervalTest {
    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue(){
      assertTrue(new Interval(-1.7,5555.0).include(0.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithExcludedValueThenFalse(){
      assertFalse(new Interval(-1.7,5555.0).include(5555.1));
    }
}
