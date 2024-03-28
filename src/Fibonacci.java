public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    //Function with recursion
    static int fibonacci(int n){
        //base condition
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //Function without recursion
    static int fibonacci1(int n){
        int previous = 0;
        int current = 1;
        int counter = 1;
        while(counter < n){
            int temp = current;
            current += previous;
            previous = temp;
            counter++;
        }
        return current;
    }
}
