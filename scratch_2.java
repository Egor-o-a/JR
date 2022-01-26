package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class scratch_2{
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[20];
        for(int i=0;i<20;i++)
        {
            String s = reader.readLine();
            big[i] = Integer.parseInt(s);
        }
        int[] smal1 = new int[10];
        int[] smal2 = new int[10];
        for(int j=0;j<10;j++)
        {
            smal1[j]=big[j];
            smal2[j]=big[10+j];
        }
        for(int z=0; z<10;z++)
        {
            System.out.println(smal2[z]);
        }
    }
}
