package com.javamaze;

public class MazeRunner {
    public static void main(String[] args) {
        int [][] data = {
                {4, 6, 3, 10},
                {4, 2, 40, 1, 7, 99, 100},
                {5, 34, 1, 43}
        };
        data[1][2] = 49;
        System.out.println(data[1][2]);

        for (int i = 0; i < data.length; i++) {
            System.out.println("row index " + i);
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);

            }

        }
    }
}
