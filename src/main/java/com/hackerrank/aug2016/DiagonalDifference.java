package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int dimension = in.nextInt();

        int[][] matrix = new int[dimension][dimension];
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        int count = 0;
        while(count < dimension){
            primaryDiagonalSum += matrix[count][count];
            secondaryDiagonalSum += matrix[count][dimension - count -1];
            count ++;
        }
        int result = primaryDiagonalSum - secondaryDiagonalSum;

        System.out.println((result < 0)?(result * -1):(result));
    }
}
