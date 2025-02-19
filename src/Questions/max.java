package Questions;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array ");
        int i = sc.nextInt();
        int[] arr = new int[i];

        //taking input
        for (int j = 0; j <arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        // interating the array
        int maxVal = arr[0];
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j] > maxVal ) {
            maxVal = arr[j];
            }
        }
        System.out.println("Maximum value of the provided array is " + maxVal);
    }
}

// this can also be done using a function
/* static int swap(int[] arr){
int maxVal = arr[0];
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j] > maxVal ) {
            maxVal = arr[j];
            }
        }
        return max;
        }
// -> for getting max in any range use this method
* static int swap(int[] arr,int start, int end){
int maxVal = arr[start];
        for (int j = start; j <= end ; j++) {
            if (arr[j] > maxVal ) {
            maxVal = arr[j];
            }
        }
        return max;
        }
* this is the method done by the mentor
* and the working method above is purely a logic of mine
*/