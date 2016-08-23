package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/23/16.
 * https://www.hackerrank.com/challenges/array-left-rotation
 * Points: 0.00 Rank: 136637
 * 5 4
 * 1 2 3 4 5
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int count = in.nextInt();
        final int rotations = in.nextInt();

        int[] input = new int[count];
        int[] output = new int[count];

        for(int i=0; i < count; i++){
            input[i] = in.nextInt();
        }

        for(int index=0; index < count; index++){
            int newIndex = index - rotations;
            if (newIndex < 0)
                newIndex = count + newIndex;
            output[newIndex] = input[index];
        }
        for (int toPrint:output) {
            System.out.printf(String.valueOf(toPrint) + " ");
        }
    }
}
