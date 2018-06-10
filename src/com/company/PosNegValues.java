package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PosNegValues {

    public static void PosNegValues(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases-->0){
            int numElements = Integer.parseInt(br.readLine());
            //int numArray[] = new int[numElements];

            String numArrStr = br.readLine();
            String[] splitArr = numArrStr.trim().split(" ");
            Set<Integer> numSet = new TreeSet<>();
            for(int i=0;i<splitArr.length;i++) {
                //numArray[i] = Integer.parseInt(splitArr[i]);
                numSet.add(Integer.parseInt(splitArr[i]));
            }

            int[] numArr = numSet.stream().mapToInt(Integer::intValue).toArray();
            int leftPtr = 0;
            int rightPtr = numSet.size()-1;
            int leftNum;
            int rightNum;
            while (leftPtr!=rightPtr && leftPtr<rightPtr){
                leftNum = numArr[leftPtr];
                rightNum = numArr[rightPtr];
                if(leftNum+rightNum==0){
                    --rightPtr;
                    ++leftPtr;
                    System.out.print(leftNum + " " + rightNum + " ");
                }
                else if(Math.abs(leftNum)<rightNum)
                    --rightPtr;
                else if(Math.abs(leftNum)>rightNum)
                    ++leftPtr;
            }
            System.out.println();
        }
    }
}

/*
2
6
1 -3 2 3 6 -1
8
4 8 9 -4 1 -1 -8 -9
*/
