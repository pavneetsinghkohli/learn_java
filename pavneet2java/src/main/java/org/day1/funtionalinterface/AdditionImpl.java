package org.day1.funtionalinterface;

public class AdditionImpl implements Addition{

    @Override
    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
