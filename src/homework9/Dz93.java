package homework9;
/*
5*) Написать метод который найдет минимальный элемент матрицы.
*/
public class Dz93 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, -7, 8}};

        int minElement = getMinElement(matrix);
        System.out.println(minElement);
    }

    private static int getMinElement(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minElement > matrix[i][j]) {
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }
}
