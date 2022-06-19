package com.dilshan.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        System.out.println(sum(7, new int[]{2, 3}, new HashMap<>()));
        System.out.println(sum(300, new int[]{2}, new HashMap<>()));
    }

    public static boolean sum(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {

        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;


        for (int number : numbers
        ) {

            if (sum(targetSum - number, numbers, memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }


        memo.put(targetSum, false);
        return false;

    }
}
