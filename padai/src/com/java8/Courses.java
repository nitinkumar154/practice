package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Courses {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNumOfStudent() {
		return numOfStudent;
	}

	public void setNumOfStudent(int numOfStudent) {
		this.numOfStudent = numOfStudent;
	}
	@Override
	public String toString() {
		return "Courses [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", numOfStudent="
				+ numOfStudent + "]";
	}
	
	public Courses(String name, String category, int reviewScore, int numOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.numOfStudent = numOfStudent;
	}

	private String category;
	private int reviewScore;
	private int numOfStudent;
	
	public static void main(String[] args) {
		List<Courses> list = List.of(
				new Courses("Spring", "framework", 98, 20000),
				new Courses("Spring Boot", "framework", 95, 18000),
				new Courses("API", "Micro service", 95, 22000),
				new Courses("MicroServices", "Micro service", 99, 42000),
				new Courses("FullStack", "Fullstack", 88, 25000),
				new Courses("AWS", "Cloud", 93, 32000),
				new Courses("GCP", "Cloud", 91, 10000),
				new Courses("Docker", "Cloud", 70, 17000),
				new Courses("Kubernetes", "Cloud", 93, 280000)
				);
System.out.println("print all courses score greter than 90");
 Predicate<? super Courses> predicateGreaterThan90 = courses->courses.reviewScore>90;
System.out.println( list.stream().allMatch(predicateGreaterThan90));
System.out.println("sort the list based in the review score");
Comparator<Courses> courseComparatorByScore= Comparator.comparing(Courses::getReviewScore);
list.stream().sorted(courseComparatorByScore).forEach(System.out::println);

System.out.println("sort the list based in the review score in reverse");
Comparator<Courses> courseComparatorByScoreInReverse= Comparator.comparing(Courses::getReviewScore).reversed();
list.stream().sorted(courseComparatorByScoreInReverse).forEach(System.out::println);


System.out.println("sort the list based in the review score then based in number of students in reverse");
Comparator<Courses> courseComparatorByScoreAndStudentsInReverse= Comparator.comparing(Courses::getReviewScore).thenComparing(Courses::getNumOfStudent).reversed();
list.stream().sorted(courseComparatorByScoreAndStudentsInReverse).forEach(System.out::println);



System.out.println("courses greater than 95 score are \n"+list.stream().takeWhile(course-> course.getReviewScore()>=95).collect(Collectors.toList()));
System.out.println("example of the group by");

System.out.println(list.stream().collect(Collectors.groupingBy(course->course.getCategory(),Collectors.counting())));
	System.out.println("print first 10 even numbers");
	long count = IntStream.iterate(0, num->num+2).limit(10).peek(System.out::println).count();
	System.out.println(count);
	
	
	
	Map<String, List<Courses>> map = list.stream().collect(Collectors.groupingBy(course->course.getCategory()));
	System.out.println("map"+map);
	
	Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(course->course.getCategory(),Collectors.counting()));
	System.out.println("map2"+map2);
	
	
	
	List<Integer>intList = List.of(1, 55, 24, 22, 37);
	int num = intList.stream().findFirst().orElse(Integer.MIN_VALUE);
	System.out.println("first value in list"+num);
	}
	
	
	
	// create a map with key as course category and course as value,
	
	


	

}
