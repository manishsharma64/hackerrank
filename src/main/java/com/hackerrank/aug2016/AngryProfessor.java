package com.hackerrank.aug2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 8/24/16.
 * https://www.hackerrank.com/challenges/angry-professor
 * Points: 191.17 Rank: 109204
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        while(testCases-- > 0){
            int numberOfStudents = in.nextInt();
            int minStudents = in.nextInt();

            for(int i=0; i < numberOfStudents; i++){
                if(in.nextInt() <= 0){
                    minStudents--;
                }
            }
            if(minStudents <= 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
