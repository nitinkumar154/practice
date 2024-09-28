package com.java8;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	private String name;
    private int age;
 
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
        public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Mary",25);
 
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
		//filter all the employee whose age is greater than 20 and print the employee names
		
		list.stream().filter(e->e.getAge()>20).forEach(e->System.out.println(e.getName()));
	List<String> oldEmployees=	list.stream().filter(e->e.getAge()>20).map(e->e.getName()).collect(Collectors.toList());
	System.out.println(oldEmployees);
	
	
	//Given the list of employees, count number of employees with age 25?
	long AgeEmployeeCount = list.stream().filter(e->e.getAge()==25).count();
	System.out.println(AgeEmployeeCount);
	
	// max age of  the list of employee 
	list.stream().mapToInt(e->e.getAge()).max();
	//Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
	 List<Employee>sortedEmployee= list.stream().sorted((o1, o2) -> o1.getAge()-o2.getAge()).collect(Collectors.toList());
	
	System.out.println(sortedEmployee);
	
	
	 List<Employee>sortedEmployee2 =list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
	
	 System.out.println(sortedEmployee2);
	 
	 
	 Map<String, List<Employee>> EmployeeMap = list.stream().collect(Collectors.groupingBy(Employee::getName));
	 EmployeeMap.forEach((name,emp)->System.out.println(name+"   "+emp));
	
	 
	 list.stream()
	    .filter(e->e.getName().equalsIgnoreCase("Mary")).
             findAny().ifPresent(e-> System.out.println(e.getName()));
          //   ifPresentOrElse(e-> System.out.println(e.getName()), ()-> System.out.println("marry not found"));




        Map<String, Long> wordCount = Stream.of("welcome to code and decode we welcome to code here".split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));System.out.println(wordCount);
	}
	

		
}
