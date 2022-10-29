package com.careerdevs;

import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maxNum = arr.get(0);
        long minNum = arr.get(0);
        long sum = 0;
        for(Integer i:arr)
        {
            sum += i;
            if(i > maxNum)
            {
                maxNum = i;
            }
            if(minNum > i)
            {
                minNum = i;
            }
        }
        System.out.println((sum - maxNum)+" "+(sum - minNum));
    }

}

