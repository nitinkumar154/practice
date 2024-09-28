package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterfaceJava8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,9,13,4,6,2,4,12,15,7);
		
		BinaryOperator<Integer> accumulator = Integer::sum;
		int sum =  list.stream().reduce(0, accumulator);
		
			System.out.println("sum "+sum);
			
			
	}

}
