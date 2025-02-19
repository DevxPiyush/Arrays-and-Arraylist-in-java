import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
    int[] nums = {1,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
    arr[0] = 90;
    }
}
// this shows mutability that is object is changeable
// arrays is mutable