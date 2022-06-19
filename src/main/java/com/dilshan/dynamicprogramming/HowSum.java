package com.dilshan.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(sum(7, new int[]{5,3,4,7}, new HashMap<>()));
        System.out.println(sum(300, new int[]{2}, new HashMap<>()));
    }

    public static List<Integer> sum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {

        if(memo.containsKey(targetSum))return memo.get(targetSum);
        if(targetSum == 0) return new ArrayList<>(0);
        if(targetSum < 0)return null;


        for (int number: numbers
             ) {

            List<Integer> ret = sum(targetSum - number, numbers, memo);


            if( ret != null) {
                ret.add(number);
                memo.put(targetSum, ret);
                return ret;
            }
        }


//        memo.put(targetSum, false);
        return null;

    }
}
