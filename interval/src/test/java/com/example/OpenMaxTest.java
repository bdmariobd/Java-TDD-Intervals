package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpenMaxTest{

    @Test
    public void givenOpenMaxWhenGreaterThanThenTrue() {
        assertTrue(new OpenMax(1.0).greaterThan(0.0));
    }

}
