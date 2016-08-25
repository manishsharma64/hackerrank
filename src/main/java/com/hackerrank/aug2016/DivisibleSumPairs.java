package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/24/16.
 * https://www.hackerrank.com/challenges/divisible-sum-pairs
 * Points: 181.17 Rank: 113507
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int count = in.nextInt();
        final int k = in.nextInt();
        int[] input = new int[count];
        int possibleMatch = 0;

        for(int i=0; i < count; i++){
            input[i] = in.nextInt();
        }

        for(int i=0; i < count - 1; i++) {
            for (int j = i+1; j < count; j++) {
                int sum = input[i] + input[j];
                if(sum % k == 0)
                    possibleMatch++;
            }
        }

        System.out.println(possibleMatch);
    }
}
