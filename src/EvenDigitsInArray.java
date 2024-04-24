public class EvenDigitsInArray {
    //Program to calculate number of even digits in an array
    public static void main(String[] args) {
        int[]arr = {2,3,5,6,7,8,9,12,11,34,79,111,90};
        System.out.println(evenDigits(arr));
    }
    static int evenDigits(int[]arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                counter++;
            }
        }
        return counter;
    }
    static boolean even(int i) {
        return i % 2 == 0;
    }
    // To test for number of odd digits substitute even with odd
    static boolean odd(int i){
        return i % 2 != 0;
    }
}
