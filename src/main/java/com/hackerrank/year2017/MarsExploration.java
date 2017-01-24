package com.hackerrank.year2017;

import java.util.Scanner;

/**
 * Created by manishsharma on 1/24/17.
 * https://www.hackerrank.com/challenges/mars-exploration
 * max Score 15
 * Easy
 */
public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int result = 0;
        final char capS = 'S';
        final char capO = 'O';

        char[] cArr = S.toCharArray();

        for(int i=0; i < cArr.length; i+=3){
            if(cArr[i] != capS)
                result++;
            if(cArr[i+1] != capO)
                result++;
            if(cArr[i+2] != capS)
                result++;
        }
        System.out.println(result);
    }
}
//SOS
//        OOS
//OSO
//        SOS
//OSS
//        OSO
//SOS
//        OSO
//SOS