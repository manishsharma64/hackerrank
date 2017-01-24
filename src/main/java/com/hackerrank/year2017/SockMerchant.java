package com.hackerrank.year2017;

import java.util.Scanner;

/**
 * Created by manishsharma on 1/24/17.
 * https://www.hackerrank.com/challenges/sock-merchant
 * Points: 276.17 Rank: 104152
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int result = 0;

        for(int i=0; i< c.length - 1; i++){
            int colorCount = 0;
            for(int j=i+1; j< c.length; j++){
                if(c[i] == c[j]){
                    colorCount++;
                }
            }
            result = result + (colorCount%2);
        }
        System.out.println(result);
    }
}
