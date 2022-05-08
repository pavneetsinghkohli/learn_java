package org.day1.funtionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0) return true;
        return false;
    }
}
