package com.java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaCodeInterViewQuestion {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(5);
        ll.get(1);

        Set<Integer> set = new HashSet<>();
        Stream.of(1,2,2,4,22,12,15,66,16,31,16,12,11,1,9,2,25,22,34).filter(x->!set.add(x)).collect(Collectors.toList()).forEach(System.out::println);


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

        // print duplicate number from list
        System.out.println("print only duplicate number from list");

       List<Integer> dupNum = Stream.of(1, 2, 2, 4, 22, 12, 15, 66, 16, 31, 16, 12, 11, 1, 9, 2, 25, 22, 34).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
            dupNum.stream().forEach(System.out::println);

        System.out.println("find common elelet in arrays");
        List<Integer> commonEle = Arrays.asList(1,2,3,4,5,6).stream().filter(n1->Arrays.asList(2,3,12,15,5,8).stream().anyMatch(num->num==n1)).collect(Collectors.toList());
        commonEle.stream().forEach(System.out::println);

    }

    public static boolean checkPrime(int num){
        return num>1 && IntStream.range(2,(int)Math.sqrt(num)).noneMatch(x->num%x==0);







    }
}
