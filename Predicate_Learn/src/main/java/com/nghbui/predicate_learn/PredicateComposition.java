package com.nghbui.predicate_learn;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isNotZero = x -> x != 0;

        System.out.println("and() operation");
        System.out.println(isEven.and(isNotZero).test(2));
        System.out.println(isEven.and(isNotZero).test(0));

        System.out.println("\nor() operation");
        System.out.println(isEven.or(isNotZero).test(2));
        System.out.println(isEven.or(isNotZero).test(0));

        System.out.println("\nnegate() operation");
        System.out.println(isEven.negate().test(2));

        System.out.println("\nisEquaL() operation");
        System.out.println(Predicate.isEqual(2).test(2));

    }
}
