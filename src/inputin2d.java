import java.util.Arrays;
import java.util.Scanner;

public class inputin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of row ");
        int i = sc.nextInt();
        System.out.print("Enter the size of column ");
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
        for (i = 0; i <arr.length ; i++) {
            for(j=0;j<arr[i].length;j++) {
            arr[i][j]= sc.nextInt();
            }
        }
        for (i = 0; i <arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
