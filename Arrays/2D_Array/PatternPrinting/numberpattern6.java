package PatternPrinitng;
/*
121212 
212121 
121212 
212121 
 */



import java.util.Scanner;

public class numberpattern6 {
    public static void main(String[] args) {
        int i, j, r, c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        r = sc.nextInt();
        System.out.println("Enter Columns : ");
        c = sc.nextInt();
        for(i= 1;i<=r;i++){
            for(j=0;j<=c;j++){
                if((i+j)%2==0){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println(" ");
            
        }

    }
    
}
