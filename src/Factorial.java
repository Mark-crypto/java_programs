import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Insert number to find its factorial: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int ans = 1;
        if(n == 0){
            ans = 1;
        }
        for (int i = n; i > 0 ; i--) {
            ans = ans * i;
        }
        return ans;
    }
}
