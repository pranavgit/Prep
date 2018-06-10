package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitOccurence {

    public static void digitOccurence(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases>0){
            int count = 0;
            int x = Integer.parseInt(br.readLine());
            String lu = br.readLine();
            int l = Integer.parseInt(lu.split(" ")[0]);
            int u = Integer.parseInt(lu.split(" ")[1]);
            for(int i=l+1;i<u;i++){
                int temp = i;
                while(temp>0){
                    if(temp%10==x)
                        count++;
                    temp = temp/10;
                }
            }
            testCases--;
            System.out.println(count);
        }
    }
}
