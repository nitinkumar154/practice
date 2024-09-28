package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapEx {
    public static void main(String[] args) {

        Emp e1 = new Emp("nitin",1, Arrays.asList("kanpur","bangalore"),2000);
        Emp e2 = new Emp("kumar",2, Arrays.asList("delhi","bihar"),1000);
        Emp e3 = new Emp("vipin",3, Arrays.asList("kanpur","delhi"),5000);
        Emp e4 = new Emp("Bihari",4, Arrays.asList("dehradoon","mangalore"),1500);

        List<List<String>> cities = Arrays.asList(e1, e2, e3, e4).stream().map(e -> e.getCityWorkedIn()).collect(Collectors.toList());
        cities.stream().forEach(System.out::println);

        /// flatmap
        Set<String> CitiesSet =
                Arrays.asList(e1, e2, e3, e4).stream().flatMap(e -> e.getCityWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println(CitiesSet);
// sort list of employee based in salary decending order
        Arrays.asList(e1, e2, e3, e4).stream().sorted((i1,i2)->i2.sal.compareTo(i1.sal)).forEach(System.out::println);

        List<Integer> top3Sal = Arrays.asList(e1, e2, e3, e4).stream().sorted((i1,i2)->i2.sal.compareTo(i1.sal)).limit(3).map(e->e.sal).collect(Collectors.toList());
        System.out.println(top3Sal);
        // fetch top three salary employee
        Arrays.asList(e1, e2, e3, e4).stream().sorted((i1,i2)->i2.sal.compareTo(i1.sal)).limit(3).forEach(System.out::println);

        // min max avg sum
        Integer max = Arrays.asList(e1, e2, e3, e4).stream().mapToInt(e->e.sal).summaryStatistics().getMax();
        System.out.println("max "+max);

        Integer min = Arrays.asList(e1, e2, e3, e4).stream().mapToInt(e->e.sal).summaryStatistics().getMin();
        System.out.println("min "+min);

        long sum = Arrays.asList(e1, e2, e3, e4).stream().mapToInt(e->e.sal).summaryStatistics().getSum();
        System.out.println("sum is "+sum);

        // find common elements in two arrays
        List<Integer> commonEle = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(num -> Arrays.asList(4, 5, 24, 23, 6).stream().anyMatch(num2 -> num2 == num)).collect(Collectors.toList());
        System.out.println(commonEle);



        int arr[] ={1,2,3,4,5};
        IntStream.range(0,arr.length/2).forEach(i->{
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;

        });
        System.out.println("odd number sum is "+ IntStream.range(1,100).filter(x->x%2!=0)
               // .peek(System.out::println)
                .summaryStatistics().getSum());
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"Nitin","Allahabad", "kolalampur", "japan"};

        int i = Arrays.asList(strArr).stream().mapToInt(x -> x.length()).max().orElse(0);
        System.out.println(i);

    }
}
class Emp{
    String name;
    int id;
    Integer sal;
    List<String> cityWorkedIn;

    public Emp(String name, int id, List<String> cityWorkedIn,Integer sal) {
        this.name = name;
        this.id = id;
        this.cityWorkedIn = cityWorkedIn;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCityWorkedIn() {
        return cityWorkedIn;
    }

    public void setCityWorkedIn(List<String> cityWorkedIn) {
        this.cityWorkedIn = cityWorkedIn;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sal=" + sal +
                ", cityWorkedIn=" + cityWorkedIn +
                '}';
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}