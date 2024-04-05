package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntervalTest {
    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue(){
      assertTrue(new Interval(-1.7,5555.0).include(0.0));
    }
}
