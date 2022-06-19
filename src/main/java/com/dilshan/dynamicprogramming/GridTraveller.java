package com.dilshan.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    public static void main(String[] args) {
        System.out.println(gt(1, 2, new HashMap<>()));
        System.out.println(gt(3, 3, new HashMap<>()));
        System.out.println(gt(10, 10, new HashMap<>()));
        System.out.println(gt(18, 18, new HashMap<>()));
    }

    /*
     *                       4,3
     *
     *
     *           3,3                         4,2
     *
     *
     * 2,3           3,2             3,2             4,1
     *
     * */

    public static long gt(int m, int n, Map<String, Long> memo) {
        String key = m + "," + n;

        if (m == 0 || n == 0) return 0;
        if (m == 1 || n == 1) return 1;
        if (memo.containsKey(key)) return memo.get(key);

        memo.put(key, gt(m - 1, n, memo) + gt(m, n - 1, memo));

        return memo.get(key);
    }
}
