package org.day2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("hej");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> stream = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
        list.stream().filter(x -> x%2==0).collect(Collectors.toList()).forEach(data -> System.out.println(data));
        System.out.println(stream);

        System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()).stream().count());

        System.out.println(list.stream().filter(x -> x%2==0).map(y -> y*5).collect(Collectors.toList()).contains(20));

        list.stream().filter(x -> x%2==0).collect(Collectors.toList()).forEach(data -> System.out.println(data));



    }
}
