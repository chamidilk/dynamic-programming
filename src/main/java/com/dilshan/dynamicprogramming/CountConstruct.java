package com.dilshan.dynamicprogramming;

import java.util.Map;

public class CountConstruct {

    public int countConstruct(String target, String[] wordBank, Map<String, Integer> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return 1;

        int totalWays = 0;
        for (String word : wordBank) {

            if (target.startsWith(word)) {

                totalWays += countConstruct(target.substring(word.length()), wordBank, memo);
            }
        }

        memo.put(target, totalWays);

        return totalWays;

    }
}
