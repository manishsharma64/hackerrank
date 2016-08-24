package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/23/16.
 * https://www.hackerrank.com/challenges/2d-array
 * Points: 20.00 Rank: 85622
 */
public class TwoDArray_DS {
    private static final int matrixSize = 6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] input = new int[matrixSize][matrixSize];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                input[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matrixSize - 2; i++) {
            for (int j = 0; j < matrixSize - 2; j++) {
                int tempSum = 0;
                tempSum += input[i][j];
                tempSum += input[i][j+1];
                tempSum += input[i][j+2];
                tempSum += input[i+1][j+1];
                tempSum += input[i+2][j];
                tempSum += input[i+2][j+1];
                tempSum += input[i+2][j+2];
                if(tempSum > max){
                    max = tempSum;
                }
            }
        }
        System.out.println(max);
    }
}
