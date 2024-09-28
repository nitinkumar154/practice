package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sortingList {
public static void printNumbers(int a ) {
	System.out.println(a);
}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(21, 24, 13, 24, 15, 46, 7, 18, 9, 10);
		System.out.println(numbers.stream().mapToInt(x->x).summaryStatistics().getMax());
		List<Integer>list = numbers;
		list.stream().forEach(System.out::println);
// ptint even numbers
		System.out.println("printing even numbers");
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		System.out.println("print odd numbers");
		list.stream().filter(num->!((num%2)==0)).forEach(System.out::println);
		
		List<String>courses = Arrays.asList("spring", "springboot", "java", "Spring service");
		//print all the courses with spring 
		
		courses.stream().filter(course-> course.contains("spring")).forEach(System.out::println);
		//course with 4 letter atleast
		System.out.println("courses with 4 lettrs or more");
		courses.stream().filter(course->course.length()>3).forEach(System.out::println);
	// cube of numbers
		System.out.println("cube");
		
		list.stream().map(num->num*num*num).forEach(System.out::println);;
	// length of the courses
		System.out.println("course length");
		courses.stream().map(course->course.length()).forEach(System.out::println);
	// sum of list of numbers
		System.out.println("sum of the number");
	int sum = list.stream().reduce(0, Integer::sum);
	 sum = list.stream().reduce(0, (x,y)->x+y);
	System.out.println(sum);
	System.out.println("max number");
	int maxNum = list.stream().reduce(0,(x,y)->x>y?x:y);
	System.out.println(maxNum);
	
	System.out.println("sum of squares");
	int sumOfSq=list.stream().map(x->x*x).reduce(0,(x,y)->x+y);
	System.out.println(sumOfSq);
	System.out.println("sum of odd numbers");
	int sumOfOddNum= list.stream().filter(x-> !((x%2)==0)).reduce(0, (x,y)->x+y);
	System.out.println(sumOfOddNum);
	System.out.println("sorted list print out");
	list.stream().sorted().forEach(System.out::println);
	
	System.out.println("sorting in reverse order");
	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println("sorting based on string length");
	courses.stream().sorted(Comparator.comparing(x->x.length())).forEach(System.out::println);
	System.out.println("make a list of square of the numbers");
	List<Integer>listsq = list.stream().map(x->x*x).collect(Collectors.toList());
	listsq.stream().forEach(System.out::println);
	
	System.out.println("even number list");
	list.stream().filter(x->x%2==0).collect(Collectors.toList()).stream().forEach(System.out::println);;
	
	System.out.println("print cource name in upper case");
	courses.stream().map(str->str.toUpperCase()).forEach(System.err::println);
	
	
	}

}
