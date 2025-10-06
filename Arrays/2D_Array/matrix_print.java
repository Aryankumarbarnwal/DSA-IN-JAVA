// Print Matrix By Taking Input From User

import java.util.Scanner;

public class matrix_print {
    static void Matrix(int arr[][],int r,int c){

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of Row : ");
        int r = sc.nextInt();
        System.out.println("Enter total number of Column : ");
        int c = sc.nextInt();
        

        int[][] arr = new int[r][c];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Matrix(arr, r, c);
    }
}
