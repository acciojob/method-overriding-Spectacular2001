package com.driver.test;

import com.driver.A;  // Importing class A
import com.driver.B;  // Importing class B
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testMethod() {
        A a = new A();  // Creating an object of class A
        B b = new B();  // Creating an object of class B

        // Testing the methods from both classes
        assertEquals("Invoking method from class A", a.meth());
        assertEquals("Invoking method from class B", b.meth());
    }
}

