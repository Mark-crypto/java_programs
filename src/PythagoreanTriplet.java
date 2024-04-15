import java.util.Scanner;

public class PythagoreanTriplet {
    //a pythagorean triplet is one which square of the first digit sum square of the second digit is equal to square of the third
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(triplet(num));
    }
    static boolean triplet(int n){
        int thirdDigit = n % 10;
        int secDigit = (n/10) % 10;
        int firstDigit = (n/100);

        return Math.pow(firstDigit,2) + Math.pow(secDigit, 2) == Math.pow(thirdDigit, 2);
    }
}
