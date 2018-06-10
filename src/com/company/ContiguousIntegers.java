package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ContiguousIntegers {

    public static void ContiguousIntegers(String filePath) throws IOException {
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

            /*Set<Integer> numSet = new TreeSet<>(Arrays.stream(numArray).boxed().collect(Collectors.toList()));
            Integer[] resArr = numSet.stream().toArray(Integer[]::new);
            int max = resArr[resArr.length-1];
            int min = resArr[0];*/

            int min = ((TreeSet<Integer>) numSet).first();
            int max = ((TreeSet<Integer>) numSet).last();
            if(max-min==numSet.size()-1)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}

/*
2
8
5 2 3 6 4 4 6 6
7
10 14 10 12 12 13 15*/
