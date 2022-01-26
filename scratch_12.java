package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/*
Выводим массивы
*/

public class scratch_12 {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //напишите тут ваш код
        String str = Arrays.toString(strings);
        System.out.println(str);
        String chs = Arrays.toString(ints);
        System.out.println(chs);
    }
}