package com.hackerrank.year2017;

import java.util.Scanner;

/**
 * Created by manishsharma on 1/24/17.
 * https://www.hackerrank.com/challenges/mini-max-sum
 * Points: 286.17 Rank: 100689
 */
public class Mini_MaxSum {
    public static void main(String[] args) {
        long[] arr = new long[5];
        Scanner in = new Scanner(System.in);
        arr[0] = in.nextLong();
        arr[1] = in.nextLong();
        arr[2] = in.nextLong();
        arr[3] = in.nextLong();
        arr[4] = in.nextLong();

        long min = Integer.MAX_VALUE;
        long max = 0;
        long sum = 0;

        for(long val:arr){
            if(val < min)
                min = val;

            if(val > max)
                max = val;

            sum += val;
        }
        System.out.println((sum-max) + " " + (sum-min));
    }
}
