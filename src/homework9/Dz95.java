package homework9;

import java.util.Arrays;

/*
7*) Написать метод который повернет матрицу на 90 градусов. Например:
1,2,3
4,5,6
результат:
4,1
5,2
6,3
*/

public class Dz95 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        turnMatrix90(matrix);
    }

    private static void turnMatrix90(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        int[][] matrix2 = new int[b][a];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][a - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }
        System.out.println();
    }
}