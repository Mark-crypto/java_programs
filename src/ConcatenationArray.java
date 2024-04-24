import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        System.out.println(concat(arr));
        //System.out.println(Arrays.toString(concat2(arr)));
    }
    //Implementation using arraylist
    static ArrayList<Integer> concat(int[]arr){
        ArrayList<Integer>ans = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arr.length; i++) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
    //implementation using array
    static int[] concat2(int[]nums){
        int []ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }
}
