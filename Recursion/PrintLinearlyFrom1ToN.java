package Recursion;
import java.util.*;
public class PrintLinearlyFrom1ToN {
    static void Print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Print(i+1,n);
    }
    public static void main(String[] args){
        int n = 5;
        Print(1,n);
    }
}
