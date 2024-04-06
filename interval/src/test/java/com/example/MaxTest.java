package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxTest {

    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue(){
      assertTrue(new Max(4, true).greaterThan(0.0));
    }
}
