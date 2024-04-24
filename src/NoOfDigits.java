import java.util.Scanner;

public class NoOfDigits {
    // Program to calculate number of digits in a number
    public static void main(String[] args) {
        //Take input from user
        System.out.print("Input a number: ");
        Scanner input =  new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(noOfDigits(number));
    }
    static int noOfDigits(int num){
        int counter = 0;
        if(num == 0){
            counter = 1;
        }
        if(num < 0){
            num *= -1;
        }
        while(num > 0){
            num /= 10;
            counter++;
        }
        return counter;
    }
}
