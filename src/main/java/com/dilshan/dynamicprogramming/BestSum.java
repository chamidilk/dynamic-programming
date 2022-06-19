package com.dilshan.dynamicprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class BestSum {

    public static void main(String[] args) {
//        System.out.println(sum(100, new int[]{5,3,25}, new HashMap<>()));

    }

    public static List<Integer> sum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return new ArrayList<>(0);
        if(targetSum < 0) return null;

        List<Integer> bestRemainderSum = null;

        for(int number: numbers){

            List<Integer> remainderSum = sum(targetSum - number, numbers, memo);

            if(remainderSum != null) {

                List<Integer> combination = new ArrayList<>(0);

                combination.addAll(remainderSum);
                combination.add(number);


                if(bestRemainderSum == null || combination.size() < bestRemainderSum.size()) {

                    bestRemainderSum = combination;

                }
            }




        }

        memo.put(targetSum, bestRemainderSum);
        return bestRemainderSum;


    }
}
