package com.javarush.task.jdk13.task06.task0633;

/*
Вырезаем середину
*/

public class scratch_6 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();
        //напишите тут ваш код
        String m = "-";
        for(int a=1;a< (chars.length - 1);a++)
        {
            for(int q=1;q< (chars[a].length - 1);q++)
            {
                chars[a][q] = m.charAt(0);
            }
        }
        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
