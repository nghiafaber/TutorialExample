package com.nghbui.predicate_learn;

import java.util.function.BiPredicate;

public class BiPredicateDivisible {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;
        System.out.println("10 divisible by 2: " + isDivisible.test(10,2));
        System.out.println("5 divisible by 3: " + isDivisible.test(5,3));
        System.out.println("8 divisible by 4: " + isDivisible.test(8,4));
    }
}
