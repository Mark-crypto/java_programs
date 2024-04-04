import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        System.out.print("Input value you are searching for: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The value is on index: " + search(arr, num));
    }
    static int search(int[]arr,int target){
        int start = arr[0];
        int end = arr[arr.length - 1];
        while(end > start){
            int mid = (start + (end-start))/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
