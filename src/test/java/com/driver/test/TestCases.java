package com.driver.test;  // Your package

import com.driver.A;  // Import the necessary classes
import com.driver.B;
import org.junit.Test;

public class TestCases {  // Start of the class

    @Test  // Example annotation, if you're using JUnit
    public void testMethod() {  // A sample test method
        A a = new A();  // Object creation from class A
        B b = new B();  // Object creation from class B

        // Add assertions or logic for your test here
    }
}

