package Recursion;
import java.util.*;
public class PrintFromNTo1 {
    static void Print(int n,int i){
        if(i<=0){
            return;
        }
        System.out.println(i);
        Print(n,i-1);
    }
    public static void main(String[] args){
        int n=5;
        int i=n;
        Print(n,i);
    }
}
