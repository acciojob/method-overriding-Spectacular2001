package com.driver.test.main.java.com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating an object of class B
        B objB = new B();

        // Calling the overridden meth() method from class B
        System.out.println(objB.meth());  // Output: Method is overridden in Extended class B
    }
}

