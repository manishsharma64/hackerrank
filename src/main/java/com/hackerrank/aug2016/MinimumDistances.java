package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 * Points: 131.17 Rank: 139483
 */
public class MinimumDistances {
    public static void main(String[] args) {
        int result = -1;
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] valArr = new int[count];
        for (int i = 0; i < count; i++) {
            valArr[i] = in.nextInt();
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (valArr[i] == valArr[j]) {
                    int temp = i - j;
                    temp = (temp < 0) ? temp * -1 : temp;
                    if(result == -1 || temp < result){
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
