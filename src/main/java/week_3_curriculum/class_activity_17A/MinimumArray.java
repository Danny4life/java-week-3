package week_3_curriculum.class_activity_17A;

public class MinimumArray {

    // Java program to return minimum array
    public static int min(int[] arr){
        // Step 1 : this line assumes that the array is not empty
        int min = arr[0];

        // Step 2 : here we are looping over the arrays
        for(int i = 1; i < arr.length; i++){
            // Step 3: this line checks if the current element arr[i] being iterated
            // over in the array is less than the current minimum value
            // if the current element is smaller, it updates the value of min to be value of the
            // current eleme
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }


    public static void main(String[] args) {
        int[] nums = {33, 6, 2, 10};

        System.out.println(min(nums));
    }
}
