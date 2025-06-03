package Recursion;
import java.util.*;
public interface FactorialofNnumbers {
    static int Factorial(int n){
        if(n<1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(Factorial(n));
    }
}
