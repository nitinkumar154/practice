package com.java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaCodeInterViewQuestion {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Stream.of(1,2,2,4,22,12,15,66,16,31,16,12,11,1,9,2,25,22,34).filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);


        // write a prog to multiple two numbers

        BiFunction<Integer,Integer,Integer> mul = (x,y)->x*y;

        System.out.println(" multiply num 5, 15 is "+mul.apply(5,15));


        // difference between limit and skip
        // limit collect n elements and n can not be negative
        // skip(n) skip first n elements
        System.out.println("limit example");
        Stream.of(1,2,4,22,12,15,66,16,31,11,9,25,34).filter(x->x%2==0).limit(2).forEach(System.out::println);
        System.out.println("skip example");
        Stream.of(1,2,4,22,12,15,66,16,31,11,9,25,34).filter(x->x%2==0).skip(2).forEach(System.out::println);

// count the number of occurance words in given string

        String s = "welcome to code decode code decode welcome to you welome to toronto";
        Map<String, Long> map = Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        System.out.println(map);
    ////
        System.out.println("check if 7 is prime "+checkPrime(7));
        System.out.println("check if 10 is prime "+checkPrime(10));




        // write a prog to print only numbers which are duplicate

        List<Integer> duplicateVal = Stream.of(1, 2, 2, 4, 22, 12, 15, 66, 16, 31, 16, 12, 11, 1, 9, 2, 25, 22, 34).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).peek(x->System.out.println("value is "+x)).collect(Collectors.toList());
        duplicateVal.stream().forEach(System.out::println);
List<Integer> intList   =Arrays.asList(1, 2, 2, 4, 22, 12, 15, 66, 16, 31, 16, 12, 11, 1, 9, 2, 25, 22, 34);



    }

    public static boolean checkPrime(int num){
        return num>1 && IntStream.range(2,(int)Math.sqrt(num)).noneMatch(x->num%x==0);
    }
}
