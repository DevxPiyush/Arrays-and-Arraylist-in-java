import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2d array is matrix sort of things
        /*
        * creating an array that looks like
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        int[][] arr = new int[3][3];

        System.out.println(arr.length); // no of rows
        // or directly as
//        int [][] twoDarr = {
//                {1,2,3}, //0th index
//                {4,5}, // 1st index
//                {6,7,8,9} // 2nd index
//        };
        // input
        for (int row = 0; row < arr.length ; row++) {
        // for each column of every row, we iterate every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
//        // output ka tareeka number 1
//        for (int row = 0; row < arr.length ; row++) {
//            // for each column of every row, we iterate every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // this adds up new lines
//        }

        // output ka tareeka number 2
        for (int row = 0; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        // output ka tareeka number 3 using enhanced for loop
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

// notes

/* syntax same as array using double sq. brackets
* difference is in object creation
* new int [size of row] [ size of column ] */

/*imagine this as array of arrays
* means the main array has internal arrays
* which takes the different parts of heap
* each particular index is itself an array*/

/* Loops ka scene 2nd wala
* as the column can have varying sizes hence in the second loop
* for every row of the array having varing length of column
* hence arr[row].length means for every array at that row -> the length of that array
* horizontal rows and vertical columns
*/