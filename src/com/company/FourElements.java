package com.company;

import java.io.*;

public class FourElements {

    public static void FourElements(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases-->0){

            int numElements = Integer.parseInt(br.readLine());
            int numArray[] = new int[numElements];

            String numArrStr = br.readLine();
            String[] splitArr = numArrStr.trim().split(" ");
            for(int i=0;i<splitArr.length;i++)
                numArray[i] = Integer.parseInt(splitArr[i]);

            int sum = Integer.parseInt(br.readLine());





        }
    }
}
