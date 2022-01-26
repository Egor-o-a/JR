package com.javarush.task.pro.task05.task0509;

/*
Таблица умножения
*/

public class scratch_5 {

    public static int[][] MULTIPLICATION_TABLE =  new int[10][10];

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
            }
        }
        for(int z=0;z<10;z++)
        {
            for(int q=0;q<10;q++)
            {
                System.out.print(MULTIPLICATION_TABLE[z][q] + " ");
            }
            System.out.println();
        }
    }
}