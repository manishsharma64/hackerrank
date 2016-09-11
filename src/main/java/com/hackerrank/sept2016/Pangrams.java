package com.hackerrank.sept2016;

import java.util.Scanner;
import java.util.Set;

/**
 * Created by manishsharma on 9/11/16.
 * https://www.hackerrank.com/challenges/pangrams
 * Points: 211.17 Rank: 106132
 */
public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int lower = 97;
        int upper = 122;


        int[] allElements = new int[upper - lower + 1];

        byte[] inputChrArr = input.toLowerCase().getBytes();
        //System.out.println(input);
        int count = 0;
        for(byte element:inputChrArr){
            System.out.println(element);
            if(element != 32 && allElements[element-lower] == 0){
                count++;
                allElements[element-lower] = 1;
            }
        }

        if(count == 26){
            System.out.println("pangram");;
        } else {
            System.out.println("not pangram");
        }
    }
}
