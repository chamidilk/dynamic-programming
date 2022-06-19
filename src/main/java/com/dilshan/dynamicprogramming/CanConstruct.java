package com.dilshan.dynamicprogramming;

import java.util.Map;

public class CanConstruct {

    public boolean canConstruct(String target, String[] wordBank, Map<String, Boolean> memo) {

        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return true;


        for (String word : wordBank) {
            if (target.startsWith(word)) {
                if (canConstruct(target.substring(word.length()), wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }

        memo.put(target, false);
        return false;
    }
}
