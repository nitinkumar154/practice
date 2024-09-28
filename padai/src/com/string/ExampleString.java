package com.string;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = "code";
        String s2 = new String("code1");
        String s3 = s2.intern();
        //System.out.println(s3);

        System.out.println(s3==s2);
        String s4 = s1.intern();

        System.out.println(s3 == s4);
    }
}
