package com.java8;

public interface DimondIssueFunctionalInterface2 {
    public void printName();

    default void m1() {
        System.out.println("default method from interface2");
    }
}
