package com;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e1= new Employee("nitin", 33,50000);
        Employee e2= new Employee("kumar", 23,250000);
        Employee e3= new Employee("Ram", 54,350000);
        Employee e4= new Employee("Rahim", 21,450000);
        Employee e5= new Employee("Keshav", 35,150000);
        Employee e6= new Employee("Mohan", 36,60000);
        // filter employee having sal>5000

        List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6).stream().
                filter(e -> e.getSalary() > 5000).collect(Collectors.toList());

        System.out.println(empList);
        Comparator<Employee> com = (E1,E2)->{
            if(E2.getName().toUpperCase().startsWith("R"))
                return 1;
            else{
              return  E1.getName().compareTo(E2.getName());
            }
        };
        List<Employee> sortedEmp = Arrays.asList(e1, e2, e3, e4, e5, e6).stream().sorted(com).collect(Collectors.toList());
        System.out.println(sortedEmp);

        


    }


}
