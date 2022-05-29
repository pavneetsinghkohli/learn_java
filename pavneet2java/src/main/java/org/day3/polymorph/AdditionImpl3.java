package org.day3.polymorph;

public class AdditionImpl3 implements Addition{


    @Override
    public void add(int a, int b) {
        System.out.println("deriving : " + a+b);

    }

    @Override
    public void sum(int x, int y, int z) {
        System.out.println("finding :" + x * y * z);

    }

    @Override
    public String display(String message) {
        return "Hello Hello to Java" + message;
    }
}
