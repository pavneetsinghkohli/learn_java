package org.day3;

import org.day3.polymorph.Addition;
import org.day3.polymorph.AdditionImpl3;

public class MainMethod {

    public static void main(String[] args) {

        Addition ad = new AdditionImpl3();

        ad.add(2,4);
        ad.sum(2,3,5);
        String display1 = ad.display(" Pavneet");
        System.out.println(display1);

        ad.calc(3,5);

        Addition.print();

//        System.out.println();
//        System.out.println();
//
//        Addition ad2 = new AdditionImpl3();
//
//        ad2.add(2,4);
//        ad2.sum(2,3,5);
//        String display = ad2.display(" Pavneet");
//        System.out.println(display);


    }

}
