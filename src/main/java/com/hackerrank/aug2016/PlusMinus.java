package com.hackerrank.aug2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by manishsharma on 8/23/16.
 * https://www.hackerrank.com/challenges/plus-minus
 * Points: 131.17 Rank: 139483
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double count = in.nextInt();

        double positive = 0, negative = 0, zeros = 0;

        for (int i = 0; i < count; i++){
            int tempInt = in.nextInt();
            if(tempInt == 0){
                zeros++;
            } else if (tempInt < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(positive/count));
        System.out.println(df.format(negative/count));
        System.out.println(df.format(zeros/count));
    }
}
