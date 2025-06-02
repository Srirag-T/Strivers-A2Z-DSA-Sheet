package Recursion;
import java.util.*;
public class PrintFromNTo1BackTracking {
    static void Print(int i,int n){
        if(i>n){
            return;
        }
        Print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 5;
        Print(1, n);
    }
}
