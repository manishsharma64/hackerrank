package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 * Points: 116.17 Rank: 148992
 */
public class CamelCase {
    public static void main(String[] args) {
        int result = 1;
        Scanner in = new Scanner(System.in);
        String camelCaseString = in.next();
        byte[] cameCaseByteArr = camelCaseString.getBytes();
        for(byte single:cameCaseByteArr){
            if(single >= 65 && single <= 90){
                result++;
            }
        }
        System.out.println(result);
    }
}
