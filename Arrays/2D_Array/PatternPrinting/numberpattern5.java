package PatternPrinitng;
// number arrngement printing
/*
1234567 
2345671 
3456712 
4567123 
5671234 
6712345 
7123456 
 */

public class numberpattern5{
    public static void main(String[] args) {
        int i, j ;
        for(i=1;i<=7;i++){
            for(j=i;j<=7;j++){
                System.out.print(j);
            }
            // System.out.println(" ");
            for(int k =1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println(" ");

        }
    }
}