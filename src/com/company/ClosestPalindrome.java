package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestPalindrome {

    public static void closestPalindrome(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases>0){
            int num = Integer.parseInt(br.readLine());
            if(num<=10)
                System.out.println(num-1);
            else {
                int palin = 0;
                int temp;
                int tempNum;
                for (int i = num - 1; i > 0; i--) {
                    temp = i;
                    tempNum = 0;
                    while (temp > 0) {
                        tempNum = (tempNum * 10) + (temp % 10);
                        temp = temp / 10;
                    }
                    if (tempNum == i) {
                        palin = i;
                        break;
                    }
                }
                for (int i = num + 1; i<num+(num-palin) ; i++) {
                    temp = i;
                    tempNum = 0;
                    while (temp > 0) {
                        tempNum = (tempNum * 10) + (temp % 10);
                        temp = temp / 10;
                    }
                    if (tempNum == i) {
                        palin = i;
                        break;
                    }

                }
                System.out.println(palin);
            }
            testCases--;
        }
    }
}
