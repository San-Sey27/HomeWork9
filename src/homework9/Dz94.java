package homework9;

import java.util.Arrays;

/*
6*) написать метод который преобразует матрицу в одномерный массив.
Например если матрица была 3x4 то массив будет на 12 элементов.
*/
public class Dz94 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, -7, 8}};

        int[] arr = array(matrix);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] array(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        int[] arr = new int[a * b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[i * b + j] = matrix[i][j];
            }
        }
        return arr;
    }
}
