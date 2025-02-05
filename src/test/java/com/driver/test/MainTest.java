package com.driver.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    
    @Test
    public void testMethodFromClassA() {
        A objA = new A();
        assertEquals("Invoking method from class A", objA.meth());
    }

    @Test
    public void testOverriddenMethodInClassB() {
        B objB = new B();
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}
