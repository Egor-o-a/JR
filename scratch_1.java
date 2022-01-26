package com.javarush.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из чисел в обратном порядке
*/

public class scratch_1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] schet = new int[10];
        for(int i=0; i<10;i++)
        {
            String s = reader.readLine();
            schet[i] = Integer.parseInt(s);
        }
        for(int j=0; j<10; j++)
        {
            System.out.println(schet[9-j]);
        }
    }
}