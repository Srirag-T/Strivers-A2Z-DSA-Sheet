package Recursion;
public class FibonacciNumber {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(fibonacci(n));
    }
}
