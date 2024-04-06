package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpenMinTest {
    @Test
    public void givenOpenMinWhenlessThanThenTrue() {
        assertTrue(new OpenMin(-1.0).lessThan(0.0));
    }

    @Test
    public void givenOpenMinWhenNotlessThanThenFalse() {
        assertFalse(new OpenMin(0).lessThan(-1.0));
    }

}
