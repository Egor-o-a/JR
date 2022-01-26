package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class scratch_9 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        multiArray = new int[N][];
        for(int i=0;i<N;i++)
        {
            int m = sc.nextInt();
            multiArray[i] = new int[m];
        }
    }
}
