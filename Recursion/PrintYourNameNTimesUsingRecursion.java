package Recursion;
import java.util.*;
public class PrintYourNameNTimesUsingRecursion {
    static void Print(int i,int n){
    if(i>n)
        return;
    System.out.println("Srirag");
    Print(i+1,n);
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(n);
        Print(1,n);

    }
}
