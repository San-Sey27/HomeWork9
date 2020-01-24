package homework9;

import java.util.Arrays;
import java.util.Random;

/*
1) написать 3 метода:
a) метод который печатает переданную в него матрицу
b) метод который заполняет случайными числами переданную в него матрицу
c) метод в который передается матрица и число. Метод должен умножить каждый элемент матрицы на число
Продемонстрировать работу всех методов.
(!!!) Результат залить на гитхаб и скинуть ссылку на репозиторий
*/

public class Dz91 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println();

        int[][] matrix2 = new int[3][3];
        randomMatrix(matrix2);
        printRandomMatrix(matrix2);
        System.out.println();

        int a = -3;  //число на которое умножаем элементы матрици
        multiplicationMatrix(matrix, a);
        printMultiplicationMatrix(matrix);
    }

    private static void printMultiplicationMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void multiplicationMatrix(int[][] matrix, int a) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= a;
            }
        }
    }

    private static void printRandomMatrix(int[][] matrix2) {
        printMultiplicationMatrix(matrix2);
    }

    private static void randomMatrix(int[][] matrix2) {
        Random random = new Random();
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = random.nextInt(20);
            }
        }
    }

    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
