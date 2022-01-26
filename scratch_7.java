package com.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/*
Шахматная доска
*/

public class scratch_7 {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)%2==0)
                {
                    array[i][j] = '#';
                }
                if((i+j)%2==1)
                {
                    array[i][j] = ' ';
                }
            }
        }
        for(int q=0;q<n;q++)
        {
            for(int w=0;w<n;w++)
            {
                System.out.print(array[q][w]);
            }
            System.out.println();
        }
    }
}
