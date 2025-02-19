import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // array of primitives
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
       for (int i = 0; i <arr.length; i++) {
           arr[i] = in.nextInt();
        }
//        for (int j : arr) { // for every element in array, print element
//            System.out.print(j + " ");
//        }
        System.out.println(Arrays.toString(arr));
       // internally this converts the array into String and hence prints - best method to print rather than iteration
    }
}
// if any array index out of the limit -> shows arrayindexoutofboundException