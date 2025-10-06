package PatternPrinitng;
/*pattern printing :- 
        1
      2   2
     3     3
    444444444
 */

public class pyramidPattern {
    public static void main(String[] args) {
        int r =6;
        int i,j,k,l;
        for( i = 1;i<=r;i++){
            for( j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for( k = 1; k<=i;k++){
                if(k==1 || i==r){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            for( l =i-1;l>=1;l--){
                if(l==(i) || l== i-2 ){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);

                }
            }
            System.out.println(" ");
        }
    }
    
}
