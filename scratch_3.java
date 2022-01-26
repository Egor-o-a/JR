package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class scratch_3 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] p = new int[15];
        for(int i=0;i<p.length;i++)
        {
            String s = reader.readLine();
            p[i] = Integer.parseInt(s);
        }
        int c=0;
        for(int j=0; j<15;j=j+2)
        {
            c+=p[j];
        }
        int n=0;
        for(int z=1; z<15;z=z+2)
        {
            n+=p[z];
        }
        if(n>c)
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if(c>n)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
