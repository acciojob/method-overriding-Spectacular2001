package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());  // This should print "Method is overridden in Extended class B"
    }
}
