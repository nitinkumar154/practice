package com.java8;

import org.w3c.dom.ls.LSOutput;

public class DimondIssueImplementingClass implements DimondIssueFunctionalInterface1, DimondIssueFunctionalInterface2{


    @Override
    public void printName() {
        System.out.println("abstract method impl");
    }

    @Override
    public void m1() {
        DimondIssueFunctionalInterface2.super.m1();


    }


    public static void main(String[] args) {
        DimondIssueImplementingClass obj = new DimondIssueImplementingClass();
        obj.m1();
    }
}
