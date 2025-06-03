package Recursion;
import java.util.*;
public class FunctionalRecursion {
    static int Sum(int n){
        if(n<1){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(Sum(n));
    }
}
