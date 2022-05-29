package org.day3.polymorph;

public class AdditionImpl2 implements Addition{


    @Override
    public void add(int a, int b) {
        System.out.println("Merging : " + a+b);

    }

    @Override
    public void sum(int x, int y, int z) {
        int v = x + y + z;
        System.out.println(v);

    }

    @Override
    public String display(String message) {
        return "Hello to Java" + message;
    }

    @Override
    public void calc(int a, int b){
        System.out.println("Testing Method to overide : " + a+b);

    }
}
