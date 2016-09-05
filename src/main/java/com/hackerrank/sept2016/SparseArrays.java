package com.hackerrank.sept2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 9/5/16.
 * https://www.hackerrank.com/challenges/sparse-arrays
 * Points: 35.00 Rank: 65577
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputStrings = new String[in.nextInt()];

        for(int i = 0; i < inputStrings.length; i++){
            inputStrings[i] = in.next();
        }

        int[] output = new int[in.nextInt()];

        for(int i = 0; i < output.length; i++){
            String temp = in.next();
            System.out.println("temp " + temp);
            for(String strElement:inputStrings){
                //System.out.println("StrElement " + strElement);
                if(strElement.equals(temp)){
                    //System.out.println("counterIncrese");
                    output[i]++;
                }
            }

        }

        for(int resultElement:output){
            System.out.println(resultElement);
        }


    }
}
