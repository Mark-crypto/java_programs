import java.util.Arrays;

public class RunningSums {
    public static void main(String[] args) {
        // Running sums of numbers in a 1D array
        int[] nums = {1,2,3,4}; //1,3,4,10
        runningSums(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void runningSums(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}
