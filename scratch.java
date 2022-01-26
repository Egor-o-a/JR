package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строк в обратном порядке
*/

public class scratch {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] famaly = new String[10];
        for(int i = 0; i<8; i++)
        {
            famaly[i] = reader.readLine();
        }

        for(int j = 0; j < 10; j++)
        {
            System.out.println(famaly[9-j]);
        }
    }
}