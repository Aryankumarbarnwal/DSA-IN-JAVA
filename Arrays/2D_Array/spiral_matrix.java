import java.util.Scanner;

public class spiral_matrix{

    static void printSpiralOrder(int matrix[][], int r,int c){
        int topRow=0, bottomRow = r-1, rightCol=c-1, leftCol=0;
        int TotalElement = 0;
        while(TotalElement > r*c){
            for(int j=leftCol ; j<=rightCol && TotalElement > r*c; j++){
                System.out.print(matrix[topRow][j] + " ");
                TotalElement++;
            }
            topRow++;

            for(int i=topRow; i<=bottomRow && TotalElement > r*c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                TotalElement++;
            }
            rightCol--;
            
            for(int i=rightCol; i>=leftCol && TotalElement > r*c; i++){
                System.out.print(matrix[i][bottomRow] + " ");
                TotalElement++;
            }
            leftCol--;

            
            for(int i=bottomRow; i>=topRow && TotalElement > r*c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                TotalElement++;
            }
            bottomRow++;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Row : ");
        int r=sc.nextInt();
        System.out.println("Enter Column : ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        System.out.println("Enter Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printSpiralOrder(matrix, r, c);
        sc.close();

    }

}