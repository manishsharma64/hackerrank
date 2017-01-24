package com.hackerrank.year2017;

import java.util.Scanner;

/**
 * Created by manishsharma on 1/24/17.
 * https://www.hackerrank.com/challenges/bon-appetit
 * Points: 296.17 Rank: 97480
 */
public class BonAppétit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int[] billItems = new int[n];

        for(int i=0; i < n; i++)
                billItems[i] = s.nextInt();

        int amtCharged = s.nextInt();

        int rightAmt = 0;

        for(int val:billItems)
            rightAmt += val;

        rightAmt = (rightAmt - billItems[k])/2;

        if(rightAmt == amtCharged){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(amtCharged - rightAmt);
        }
    }
}
