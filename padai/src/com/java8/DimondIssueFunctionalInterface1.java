package com.java8;
@FunctionalInterface
public interface DimondIssueFunctionalInterface1 {
    public void printName();
    default void m1(){
        System.out.println("default method from interface1");
    }

}
