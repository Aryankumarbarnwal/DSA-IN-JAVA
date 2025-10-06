import java.util.Scanner;

public class add_matrix {
    static void matrix(int[][] a, int[][] b, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=a[i][j]+b[i][j];
                System.out.print(a[i][j]+" ");
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
        

        int[][] a = new int[r][c];
        System.out.println("Enter Array1 Elements : ");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[r][c];
        System.out.println("Enter Array2 Elements : ");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j] = sc.nextInt();
            }
        }

        matrix(a,b, r, c);
    }
    
}
