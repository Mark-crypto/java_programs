import java.util.Scanner;

public class ReverseNo {
    public static void main(String[]args){
        System.out.print("Input number you wish to reverse: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        reverse(num);
    }
    //Reverse a number easily
    static void reverse(int num){
        int result = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            result = (result * 10) + digit;
        }
        System.out.println("Your number reversed is: " + result);

    }
}
