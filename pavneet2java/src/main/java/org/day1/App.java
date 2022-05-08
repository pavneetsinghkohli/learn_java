package org.day1;

import org.day1.funtionalinterface.Addition;
import org.day1.funtionalinterface.AdditionImpl;
import org.day1.funtionalinterface.Summation;
import org.day1.funtionalinterface.Welcome;
import org.day1.funtionalinterface.predicate.PredicateImpl;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Addition add = new AdditionImpl();
        add.add(3,5);

        Addition ad1 = (x, y) -> {
            int z = x + y;
            System.out.println(z);
        };
        ad1.add(10,10);

        Addition ad2 = (x, y) -> System.out.println(x + y);
        ad2.add(10,20);

        Summation sum = message -> System.out.println(message.toUpperCase());
        sum.test("Hello Testing !");

        Welcome wel = () -> {
            Random rn = new Random();
            int num = rn.nextInt();
            return num;
        };
        System.out.println(wel.display());

//Since i have implemented predicateImpl -  i have to instantiate, but
//if am just implementing a interface, use lambda function and write its implementation
//        so no need to crate a instance.
        Predicate<Integer> result = new PredicateImpl();
        System.out.println(result.test(11));

        Predicate<Integer> rs1 = x -> {
            if(x % 2 == 0) return true;
        return false;
        };
        System.out.println(rs1.test(20));

        Predicate<Integer> rs2 = x -> x % 2 == 0;
        System.out.println(rs2.test(21));

        String s = "Hello";
        Supplier<String> sup = () -> {return s.toUpperCase();};
        System.out.println(sup.get());

        String s1 = "Hello world";
        Supplier<String> str = () -> {
            return s1.toUpperCase();
        };
        System.out.println(str.get());

        Consumer<Integer> cn = x -> System.out.println("consumer : " + x);
        cn.accept(10);

    }
}
