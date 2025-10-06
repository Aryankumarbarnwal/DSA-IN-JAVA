import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float f= Float.valueOf(4.5f);

        ArrayList<Integer> l1 = new ArrayList<>();
        //  add element at the end
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(1));

        // print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        // printing the array list directly
        System.out.println(l1);

        // adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing an element e
        l1.remove(Integer.valueOf(17));
        System.out.println(l1);

        // checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        System.out.println(l1.lastIndexOf(6));

        // ArrayList<Integer> l = new ArrayList<>();
        // System.out.println(l.lastIndexOf(l1));


    }
}