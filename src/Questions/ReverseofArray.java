package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array ");
        int i = sc.nextInt();
        int[] arr = new int[i];

        //taking input
        for (int j = 0; j <arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;
    }
}

// to reverse the array simple stuff is
/*  we just increament the start by 1
*   decreament the end by 1 and when both the incides become same we stop over their
* */
