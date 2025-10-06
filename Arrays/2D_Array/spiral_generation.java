// WAP to generate a matrix in spiral form

import java.util.Scanner;

public class spiral_generation {

    static void printArray(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    static int[][] printMatrixSpiral(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int temp = 1;
        while (temp <= (n * n)) {
            for (int i = leftCol; i <= rightCol && temp <= n * n; i++) {
                matrix[topRow][i] = temp++;
                
            }
            topRow++;

            for (int j = topRow; j <= bottomRow && temp <= n * n; j++) {
                matrix[j][rightCol] = temp++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && temp <= n * n; j--) {
                matrix[bottomRow][j] = temp++;
            }
            bottomRow--;
            
            for (int i=bottomRow; i>=topRow && temp <= n*n; i--) {
                matrix[i][leftCol] = temp++;
            }
            leftCol++;
        }

        return matrix;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();

        int matrix[][] = printMatrixSpiral(n);
        printArray(matrix);
        sc.close();

    }

}
