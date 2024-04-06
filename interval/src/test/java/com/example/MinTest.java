package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinTest {
  @Test
  public void givenIntervalwhenNotIncludeWithLimitValueThenFalse() {
    assertFalse(new Min(4).lessThan(4.0));
  }

  @Test
  public void givenIntervalwhenIncludeWithLowerValueThenTrue() {
    assertTrue(new Min(4).lessThan(4.1));
  }
}
