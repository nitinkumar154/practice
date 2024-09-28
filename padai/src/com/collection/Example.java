package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        Emp e1 = new Emp("nitin", 33, "Male");

        Emp e2 = new Emp("Kumar", 32, "Male");
        Emp e3 = new Emp("Amit", 23, "Male");
        Emp e4 = new Emp("Nikita", 33, "Female");
        Emp e5 = new Emp("Udip", 51, "Male");
        Emp e6 = new Emp("Marry", 43, "Female");
        Emp e7 = new Emp("Anita", 39, "Female");

        List<Emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        List<Emp> sortedEmp = list.stream().sorted((i1, i2) -> i1.getAge() - i2.getAge()).collect(Collectors.toList());
        System.out.println(sortedEmp);
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i -> i.getGen(), Collectors.counting()));
        System.out.println(collect);

    }
}
class Emp{
    String name;
    int age;
    String gen;

    public Emp(String name, int age, String gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
}