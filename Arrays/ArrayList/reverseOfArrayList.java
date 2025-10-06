
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseOfArrayList {

    // Function for reverse
    // static void reverseUI(ArrayList<Integer> arr) {
    //     int n = arr.size() - 1;
    //     int i = 0;
    //     // int j = n / 2;
    //     while (i < n) {
    //         Integer temp = Integer.valueOf(arr.get(i));
    //         arr.set(i, arr.get(n));
    //         arr.set(n, temp);
    //         i++;
    //         n--;
    //     }
    //     // return temp;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter Size of ArrayList");
        int n = sc.nextInt();
        System.out.println("Enter Array");
        for (int i = 0; i < n; i++) {
            Integer l = sc.nextInt();

            l1.add(l);
        }
        System.out.println("original list : " + l1);
        // reverseUI(l1); 
        Collections.reverse(l1); // no need to write a specific fuction to reverse an array
        System.out.println("Reverse List : " + l1);

        Collections.sort(l1);
        System.out.println("Ascending order" + l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending order " +l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2. add("Welcome");
        l2.add("To");
        l2.add("Noida");
        l2.add("City");

        System.out.println("original" + l2);
        Collections.sort(l2);
        System.out.println("Sorted "+ l2);

        sc.close();
    }

}
