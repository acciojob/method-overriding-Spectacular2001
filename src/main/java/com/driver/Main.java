package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();
        System.out.println(objB.meth());  // Calling overridden meth from class B
    }
}