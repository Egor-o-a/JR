package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class scratch_4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] chi = new int[10];
        for(int i=0;i<str.length;i++)
        {
            str[i] = reader.readLine();
        }
        for(int j=0;j<chi.length;j++)
        {
            chi[j] = str[j].length();
        }
        for(int z=0;z<10;z++)
        {
            System.out.println(chi[z]);
        }
    }
}
