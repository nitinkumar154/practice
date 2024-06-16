package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student  implements Comparable<Student>{
    String name;
    int rollNum;
    int age;

    public Student(String name, int rollNum, int age) {
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNum -o.rollNum;
    }



    public static void main(String[] args) {
        Student s1 = new Student("nitin",12,36);
        Student s2 = new Student("KK",8,25);
        Student s3 = new Student("kuheli",36,25);
        Student s4 = new Student("Aman",16,24);
        Student s5 = new Student("saumya",25,18);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
      //  Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);

        System.out.println("sort based on name");
        Collections.sort(list,new StudentNameComparator());
        System.out.println(list);
    }

}
class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
