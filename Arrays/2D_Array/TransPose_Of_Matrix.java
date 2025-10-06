// package 2D_matrixay;
import java.util.Scanner;


public class TransPose_Of_Matrix {
    static void printmatrixay(int matrix[][], int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static int[][] transpose(int[][] matrix, int r, int c){
        int trans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }

    static void transInPlace(int matrix[][], int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of Row : ");
        int r = sc.nextInt();
        System.out.println("Enter total number of Column : ");
        int c = sc.nextInt();
        

        int[][] matrix = new int[r][c];
        System.out.println("Enter matrixay Elements : ");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("After Transpose : ");
        // int ans[][]=transpose(matrix, r, c);
        transInPlace(matrix, r, c);
        printmatrixay(matrix, r, c);

    }
}
    

