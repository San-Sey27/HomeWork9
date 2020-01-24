package homework9;

import java.util.Arrays;
/*
2.1*) Написать метод который принимает 2 матрицы одного размера
 и вернет сумму 2 матриц - каждый элемент будет суммой соотв.
  элементов матриц параметров.
  2.2*) Написать 2 метода, которым передают матрицу и индексы a, b
•	Первый метод должен поменять 2 строки матрицы местами
•	второй 2 столбца
  */

public class Dz92 {

    public static void main(String[] args) {
        int[][] matrixA = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][] matrixB = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int[][] sumMatrix = sumMatrixAB(matrixA, matrixB);
        printSumMatrix(sumMatrix);

        int a = 0;
        int b = 2;
        replacementString(matrixA, a, b);
        replacementColumn(matrixA, a, b);
    }

    private static void replacementColumn(int[][] matrixA, int a, int b) {
        for (int i = 0; i < matrixA.length; i++) {
            int tmp = matrixA[i][a];
            matrixA[i][a] = matrixA[i][b];
            matrixA[i][b] = tmp;
        }
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(matrixA[i]));
        }
        System.out.println();
    }

    private static void replacementString(int[][] matrixA, int a, int b) {
        int[] tmp = matrixA[a];
        matrixA[a] = matrixA[b];
        matrixA[b] = tmp;
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(matrixA[i]));
        }
        System.out.println();
    }

    private static void printSumMatrix(int[][] sumMatrix) {
        for (int i = 0; i < sumMatrix.length; i++) {
            System.out.println(Arrays.toString(sumMatrix[i]));
        }
        System.out.println();
    }

    private static int[][] sumMatrixAB(int[][] matrixA, int[][] matrixB) {
        int a = matrixA.length;
        int b = matrixA[0].length;
        int[][] sumMatrix = new int[a][b];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }
}