package com.driver.test;

import static org.junit.Assert.*;

import com.driver.B;
import org.junit.jupiter.api.Test;

public class TestCases {
    
 @Test
    public void testMeth() {
        B obj = new B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }
}
