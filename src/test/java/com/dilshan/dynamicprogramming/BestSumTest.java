package com.dilshan.dynamicprogramming;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;



class BestSumTest {

    @Test
    void sum() {

        // given
        int targetSum = 100;
        int[] numbers = new int[]{5,3,100};

        // when
        List<Integer> result = BestSum.sum(targetSum, numbers, new HashMap<>());

        // then
        List<Integer> expected = new ArrayList<>();
        Arrays.stream(new int[]{100}).forEach(expected::add);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumWhenGivenZero() {

        // given
        int targetSum = 0;
        int[] numbers = new int[]{5,3,100};

        // when
        List<Integer> result = BestSum.sum(targetSum, numbers, new HashMap<>());

        // then
        List<Integer> expected = new ArrayList<>();
        assertThat(result).isEmpty();
    }

    @Test
    void sumWhenGiven17() {

        // given
        int targetSum = 17;
        int[] numbers = new int[]{5,100};

        // when
        List<Integer> result = BestSum.sum(targetSum, numbers, new HashMap<>());

        // then
        List<Integer> expected = new ArrayList<>();
        assertThat(result).isNull();
    }
}