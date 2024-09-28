package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        // predicate ex


        Predicate<String> checkLen = (s)->s.length()>5;

        System.out.println("check if nitinkumar length status is "+checkLen.test("nitinkumar"));


        // function functional interface

        Function<String, String> getFullName = (s)->  "hello "+s;

        System.out.println(getFullName.apply("Nitin"));

        Function<Integer,Integer> sq = s->s*s;

        System.out.println("square of 2 is "+sq.apply(2));


        // consumer interface


        Consumer<String> consume =s-> System.out.println("my name is "+s);
        Consumer<String> ageConsumer =s-> System.out.println("my age is "+s);

        consume.andThen(ageConsumer).accept("nitin");
        // chaining used when multiple operation on single input

        //supplier interface

        Supplier<String> supplyString = ()-> String.valueOf(Math.random()*100);
        System.out.println("get a random number");
        System.out.println(supplyString.get());


        // Streams on java 8 useful for collection.

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(8);
        intList.add(3);
        intList.add(9);
        intList.add(12);
        intList.add(5);

        Stream<Integer> evenNumStream = intList.stream().filter(s->s%2==0);
        evenNumStream.forEach(System.out::println);
        System.out.println("odd list");

        intList.stream().filter(s->s%2!=0).forEach(System.out::println);


        // map in stream
        System.out.println("map stream to sq  value");
        intList.stream().map(x->x*x).forEach(System.out::println);

        // collect ex
        List<Integer> evenList = intList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        evenList.stream().forEach(System.out::println);

        // count ex
        long numberOfEvenNumber = intList.stream().filter(s -> s % 2 == 0).count();
        System.out.println("even number in list "+numberOfEvenNumber);

        // sorting on stream
        // use sorted() for natural sorting or use custom sort using comparator
        System.out.println("sorted list");
        intList.stream().sorted().forEach(System.out::println);


        // custom sorting in stream
        // decending order
        System.out.println("decending order");
        intList.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);

        // using max min
        Integer minVal = intList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        Integer maxVal = intList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("min val "+minVal+" and Max Val is "+maxVal );

        // of ex
        Stream.of(25,26,1,56,21,16,18,28,31).forEach(System.out::println);
        // toArray ex
        Object[] objects = Stream.of(25, 26, 1, 56, 21, 16, 18, 28, 31).toArray();
        System.out.println();
        Arrays.stream(objects).forEach(System.out::println);
        
        // peek() ex
        List<Integer> evenNumberList = Stream.of(25, 26, 1, 56, 21, 16, 18, 28, 31).filter(s -> s % 2 == 0).peek(s -> System.out.println(s)).collect(Collectors.toList());
        // reduce used to get single value from stram
        Integer sum = Stream.of(1, 2, 3, 4, 5).reduce(1, (a, b) -> a + b);
        System.out.println(sum);
        // in absence of identy parameter it gives optional object
        Stream.of(1, 2, 3, 4, 5).reduce((a,b)->a+b).get();
    // short circuit op
        System.out.println("short circuit op");
        List<Integer> twoEvenList = Stream.of(25, 26, 1, 56, 21, 16, 18, 28, 31).filter(s -> s % 2 == 0).limit(2).collect(Collectors.toList());
        twoEvenList.stream().forEach(System.out::println);
        // anymatch 
        boolean b = Stream.of(25, 26, 1, 56, 21, 16, 18, 28, 31).anyMatch(x -> x % 2 == 0);

    }
}
