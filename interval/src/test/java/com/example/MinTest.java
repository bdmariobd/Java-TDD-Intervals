package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinTest {
    @Test
    public void givenIntervalwhenIncludeWithIncludedValueThenTrue(){
      assertTrue(new Min(-4, true).lessThan(0.0));
    }

    @Test
    public void givenIntervalwhenIncludeWithExcludedValueThenFalse(){
      assertFalse(new Min(4, true).lessThan(0.0));
    }

    @Test
    public void givenIntervalwhenNotIncludeWithLimitValueThenFalse(){
      assertFalse(new Min(4, false).lessThan(4.0));
    }

}
