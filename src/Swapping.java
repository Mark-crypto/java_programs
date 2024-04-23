import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Input index of number to swap: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int last = input.nextInt();
        swap(first, last, arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int first, int last, int []arr){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
