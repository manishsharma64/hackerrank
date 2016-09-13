package com.hackerrank.sept2016;

import java.util.Scanner;

/**
 * Created by manishsharma on 9/12/16.
 * https://www.hackerrank.com/challenges/insertionsort1
 * Points: 231.17 Rank: 98830
 *
 */
public class InsertionSort_Part1 {

    public static void insertIntoSorted(int[] inputArr) {
        if (inputArr.length == 1) {
            printArray(inputArr);
        } else {
            for (int i = 1; i < inputArr.length; i++) {
                int temp = inputArr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (inputArr[j] > temp) {
                        inputArr[j + 1] = inputArr[j];
                        if (j == 0) {
                            inputArr[j + 1] = inputArr[j];
                            printArray(inputArr);
                            inputArr[j] = temp;
                            printArray(inputArr);
                            break;
                        }
                        printArray(inputArr);
                    } else if (i == (j + 1)) {
                        break;
                    } else if (inputArr[j] < temp) {
                        inputArr[j + 1] = temp;
                        printArray(inputArr);
                        break;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

//    public static void main(String[] args) {
//
//
//        Scanner in = new Scanner(System.in);
//
//        int length = in.nextInt();
//        int[] inputArr = new int[length];
//
//        for (int index = 0; index < length; index++) {
//            inputArr[index] = in.nextInt();
//        }
//
////        for (int i = inputArr.length - 1; i >= 0; i--) {
////            int temp = inputArr[i];
////            for (int j = i - 1; j >= 0; j--) {
////                if(inputArr[j] > temp){
////                    inputArr[j+1] = inputArr[j];
////                } else if(inputArr[j] < temp){
////                    inputArr[j+1] = temp;
////                    break;
////                }
////                printArray(inputArr);
////            }
////        }
//        printArray(inputArr);
//    }

}
