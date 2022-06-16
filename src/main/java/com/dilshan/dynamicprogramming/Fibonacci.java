package com.dilshan.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(3, new HashMap<>(0)));
        System.out.println(fib(4, new HashMap<>(0)));
        System.out.println(fib(5, new HashMap<>(0)));
        System.out.println(fib(50, new HashMap<>(0)));

    }

    public static long fib(int n, Map<Integer, Long> memo){

        if(n == 1 || n == 2) return 1;
        if(memo.containsKey(n)) return memo.get(n);

        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));

        return memo.get(n);

    }
}
