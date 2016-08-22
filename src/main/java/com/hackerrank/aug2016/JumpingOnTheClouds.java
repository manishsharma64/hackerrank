package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int numberOfJumps = 0;
        Scanner in = new Scanner(System.in);
        final int count = in.nextInt();
        int[] inputArr = new int[count];

        for(int i=0; i < count; i++){
            inputArr[i] = in.nextInt();
        }

        for(int i=1; i < count; i++){
            int temp = inputArr[i];
            if(temp == 0) {
                numberOfJumps++;

                if ((i+1) < count) {
                    temp = inputArr[i + 1];
                    //If next value is zero but previous value is not 1.
                    if (temp == 0 && inputArr[i - 1] != 1) {
                        i++;
                    }
                }
            }
        }
        System.out.println(numberOfJumps);
    }
}
