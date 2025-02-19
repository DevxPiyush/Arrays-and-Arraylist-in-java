public class BasicofArray{
    public static void main(String[] args) {

        // store 5 roll no
          int[] r_no = new int[5];
//       or directly write this
        int[] r_no2 = {23,12,45,32,15};
         //int[] ros; //declaration of array. ros is getting defined in the stack
         //ros = new int[5]; // initialisation:actually here object is being created in the memory (heap)
        System.out.println(r_no2[2]);
    }
}

/* notes
-> syntax of array
   datatype[] variable_name = new datatype[size];
* 1. array objects are in heap
* 2. heap objects are not continuous
* 3. dynamic memory allocation
* hence array objects in java may not be continuous
* indexing starts with 0 in array
* new keyword is used to create an object
* */