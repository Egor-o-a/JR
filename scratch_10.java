package com.javarush.task.pro.task05.task0512;

/*
Создаем мультимассив
*/

public class scratch_10 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i=0;i<multiArray.length;i++) {
            for(int j=0;j<multiArray[i].length;j++) {
                for(int q=0;q<multiArray[i][j].length;q++) {
                    System.out.println(multiArray[i][j][q]);
                }
            }
        }
    }
}