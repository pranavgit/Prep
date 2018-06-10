package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class MaxTipCalculator {

    public static void MaxTipCalculator(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases-->0){
            String[] params = br.readLine().trim().split(" ");
            int totalOrders = Integer.parseInt(params[0]);
            int x = Integer.parseInt(params[1]);
            int y = Integer.parseInt(params[2]);

            int A[] = new int[totalOrders];
            int B[] = new int[totalOrders];

            String[] numArrStr1 = br.readLine().trim().split(" ");
            for(int i=0;i<numArrStr1.length;i++) {
                A[i] = Integer.parseInt(numArrStr1[i]);
            }

            String[] numArrStr2 = br.readLine().trim().split(" ");
            for(int i=0;i<numArrStr2.length;i++) {
                B[i] = Integer.parseInt(numArrStr2[i]);
            }

            int maxTip=0;
            for(int i=0;i<totalOrders;i++){
                if(A[i]>B[i])
                    maxTip = maxTip + A[i];
                else
                    maxTip = maxTip + B[i];
            }

            System.out.println(maxTip);
        }
    }
}

/*
2
5 3 3
1 2 3 4 5
5 4 3 2 1
8 4 4
1 4 3 2 7 5 9 6
1 2 3 6 5 4 9 8
*/
