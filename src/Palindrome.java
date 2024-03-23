import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Input your number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println( isPalindrome(number));
    }
    static boolean isPalindrome(int num){
        int digit = 0;
        int temp = num;
        int rem;
        while(num > 0 ){
            rem = num % 10;
            num /= 10;
            digit = (digit * 10) + rem;
        }
        return temp == digit;
    }
}
