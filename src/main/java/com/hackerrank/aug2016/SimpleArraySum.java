package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/22/16.
 */
public class SimpleArraySum {

    public static void main(String args[]) throws Exception {
        int result = 0;
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        while(count !=0){
            count--;
            result += in.nextInt();
        }

        System.out.println(result);
    }
}
