package com.dilshan.dynamicprogramming;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FibonacciTest {

//    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci50(){
        // given
        int n = 50;

        // when
        long result = Fibonacci.fib(n, new HashMap<>());

        // then
        Assertions.assertThat(result).isEqualTo(12586269025L);
    }

    @Test
    public void testFibonacci10(){
        // given
        int n = 10;

        // when
        long result = Fibonacci.fib(n, new HashMap<>());

        // then
        Assertions.assertThat(result).isEqualTo(55L);
    }


}
