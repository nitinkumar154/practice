package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Javaex {

    public static void main(String[] args) {

        Student s1  = new Student("nitin", 36, 22, "civil");
        Student s2  = new Student("nitin", 36, 22, "comp");
        Student s3  = new Student("nitin", 36, 22, "comp");
        Student s4  = new Student("nitin", 36, 22, "mech");
        Student s5  = new Student("nitin", 36, 22, "civil");
        Student s6  = new Student("nitin", 36, 22, "mech");
        Student s7  = new Student("nitin", 36, 22, "civil");
        Student s8  = new Student("nitin", 36, 22, "mech");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);list.add(s3);list.add(s4);list.add(s5);list.add(s6);
        list.add(s7);
        list.add(s8);

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e.dept, Collectors.counting()));
        System.out.println(collect);


    }




}
