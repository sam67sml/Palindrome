package ru.sberbank;

import java.io.*;
public class Solution
{

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // File file = new File("E:\\ÑáåðÒåõ\\Java school\\HelloWorld\\src\\ru\\sberbank\\input.txt");
        // FileReader fileReader = new FileReader(file);
        // BufferedReader br = new BufferedReader(fileReader);
        int count = Integer.parseInt(br.readLine());
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = new int[stringArray.length];
        int needToChangeNumbers = 0;

        for (int i = 0; i < count; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int i=0, j=count-1;
        while (i<j){
            if (intArray[i] != intArray[j]) needToChangeNumbers++;
            i++; j--;
        }
        System.out.println(needToChangeNumbers);
    }
}