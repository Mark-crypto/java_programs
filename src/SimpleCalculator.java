import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        calculator();
    }
    static void calculator(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Input your operator/sign: ");
            char sign = input.next().trim().charAt(0);
            int result = 0;
            if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%' ) {
                System.out.print("Input two numbers to calculate: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(sign == '+'){
                    result = num1 + num2;
                } else if (sign == '-') {
                    result = num1 - num2;
                } else if ( sign == '*') {
                    result = num1 * num2;
                } else if(sign == '%'){
                    result = num1 % num2;
                } else{
                    if(num2 != 0){
                        result = num1 / num2;
                    }
                }
            } else if (sign == 'x' || sign == 'X'){
                System.out.println("You have ended the program!");
                break;
            }else {
                System.out.println("Input a valid operator!");
            }
            System.out.println(result);
        }
    }
}
