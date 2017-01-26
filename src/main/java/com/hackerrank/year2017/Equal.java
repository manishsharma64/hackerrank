package com.hackerrank.year2017;

import java.util.Scanner;

/**
 * Created by manishsharma on 1/24/17.
 * https://www.hackerrank.com/challenges/equal
 * Points: 306.17 Rank: 94441
 * pass - 0, 1, 2, 10, 14
 * fail - 11,12,13
 * timeout - others
 */
public class Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        while(noOfTestCases > 0){
            --noOfTestCases;

            int noOfInputs = scanner.nextInt();
            int max = 0;
            int min = 0;
            int[] inputs = new int[noOfInputs];

            for(int i=0; i < inputs.length; i++){
                inputs[i] = scanner.nextInt();
            }

            int noOfOperation = 0;

            InputProperties ip = isInputSame(inputs);
            while(!ip.isInputSame){
                if((inputs[ip.maxIndex] - inputs[ip.minIndex]) >= 5){
                    ip = isIncreaseAndCheckInputSame(inputs, ip.maxIndex, 5);
                } else if((inputs[ip.maxIndex] - inputs[ip.minIndex]) >= 2){
                    ip = isIncreaseAndCheckInputSame(inputs, ip.maxIndex, 2);
                } else {
                    ip = isIncreaseAndCheckInputSame(inputs, ip.maxIndex, 1);
                }

                noOfOperation++;
                System.out.println(noOfOperation);
                //ip = isInputSame(inputs);
            }
            System.out.println(noOfOperation);
        }
    }

    private static void increase(int[] inputs, int chosenOne, int offSet){
        for(int i=0; i < inputs.length; i++){
            if(i != chosenOne)
                inputs[i] += offSet;
        }
    }

    private static InputProperties isInputSame(int[] inputs){
        InputProperties ip = new InputProperties();
        ip.minIndex = 0;
        ip.maxIndex = 0;

        for(int i=1; i < inputs.length; i++){
            if(inputs[i] < inputs[ip.minIndex])
                ip.minIndex = i;

            if(inputs[i] > inputs[ip.maxIndex])
                ip.maxIndex = i;
        }
        if(ip.maxIndex != ip.minIndex)
            ip.isInputSame = false;

        return ip;
    }

    private static InputProperties isIncreaseAndCheckInputSame(int[] inputs, int chosenOne, int offSet){
        InputProperties ip = new InputProperties();
        ip.minIndex = 0;
        ip.maxIndex = 0;
        inputs[chosenOne] -= offSet;

        for(int i=1; i < inputs.length; i++){
            if(inputs[i] < inputs[ip.minIndex])
                ip.minIndex = i;

            if(inputs[i] > inputs[ip.maxIndex])
                ip.maxIndex = i;
        }

        if(ip.maxIndex != ip.minIndex)
            ip.isInputSame = false;

        return ip;
    }
}

class InputProperties {
    boolean isInputSame;
    int minIndex;
    int maxIndex;

    public InputProperties(){
        isInputSame = true;
        this.minIndex = Integer.MAX_VALUE;
        this.maxIndex = Integer.MIN_VALUE;
    }
}


