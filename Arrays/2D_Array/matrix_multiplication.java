import java.util.Scanner;

public class matrix_multiplication {
    static void matrix(int[][] a, int[][] b, int r1, int c1,int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiplication Not allowed ! Wrong Dimension ");
            return;
        }
        int mul[][] =new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]= a[i][k]*b[k][j];
                    System.out.print(mul[i][j]);
                }
                
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Row and Column of Array1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter number of Row and Column of Array1: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter Array1 Elements : ");
        for(int i = 0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[r2][c];
        System.out.println("Enter Array2 Elements : ");
        for(int i = 0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        matrix(a,b, r1, c1,r2,c2);
    }
}
