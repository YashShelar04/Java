import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];


        if (isSquareMatrix(matrix)) {
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                    System.out.println();
            }
            int diagonalSum = calculateDiagonalSum(matrix);
            System.out.println("Diagonal sum: " + diagonalSum);
        } else {
            System.out.println("The matrix is not a square matrix.");
        }
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows == columns;
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        return diagonalSum;
    }
}
