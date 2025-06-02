package Recursion;
import java.util.*;
public class PrintLinearlyFrom1ToNBackTracking {
    static void Print(int i,int n){
        if(i<1){
            return;
        }
        Print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        int n = 5;
        Print(n,n);
    }
}
