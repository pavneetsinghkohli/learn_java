package org.day3.polymorph;

public class AdditionImpl implements Addition{


    @Override
    public void add(int a, int b) {
        System.out.println("adding : " + a+b);

    }

    @Override
    public void sum(int x, int y, int z) {
        System.out.println(x * y * z);

    }

    @Override
    public String display(String message) {
        return "Hello welcome to Java" + message;
    }
}
