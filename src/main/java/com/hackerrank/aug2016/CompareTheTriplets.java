package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 */
public class CompareTheTriplets {

    public static final int count = 3;

    public static void main(String args[]) {
        int aliceScore = 0,
                bobScore = 0;

        int[] alice = new int[count];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            alice[i] = in.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int bobs = in.nextInt();
            if(alice[i] > bobs){
                aliceScore++;
            }else if(alice[i] < bobs){
                bobScore++;
            }
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}
