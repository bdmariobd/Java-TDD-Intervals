package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxTest {
    @Test
    public void givenIntervalwhenNotIncludeWithLimitValueThenFalse(){
      assertFalse(new Max(4).greaterThan(4.0));
    }

    @Test
    public void givenIntervalGreaterThanThenTrue(){
      assertTrue(new Max(4).greaterThan(3.0));
    }
}
