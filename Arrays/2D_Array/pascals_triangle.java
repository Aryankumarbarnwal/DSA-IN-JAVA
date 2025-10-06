// WAP to show a matrix spiral form


import java.util.Scanner;

public class pascals_triangle {

    static void printmatrixay(int matrix[][]) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int[][] transpose(int[][] matrix, int r, int c) {
        int trans[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }

    static void transInPlace(int matrix[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static int[][] pascals(int n){
        int[][] ans = new int[n][];
        for(int i=0;i<n;i++){
            ans[i] = new int[i+1];

            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] ans = pascals(n);
        printmatrixay(ans);
    }
}
