import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[]args){
    int [] arr = {1,3,5,2,4,6};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }
    static int [] shuffle(int[] nums, int n){
        int start = 1;
        int end = n;
        for (int i = 0; i < n - 1; i++) {
            start += i;
            end += i;
            if(i % 2 == 0){

            }

            swap(nums,start,end);


        }
        return nums;
    }
    static void swap(int [] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
