package com.javarush.task.pro.task05.task0512;

/*
Создаем мультимассив
*/

import java.util.Arrays;

public class scratch_11 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(multiArray));
    }
}