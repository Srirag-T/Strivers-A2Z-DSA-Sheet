package Recursion;
import java.util.*;
public class ReverseAnArray {
    static int[] ReverseArray(int[] a,int i,int j){
        if(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            ReverseArray(a,i+1,j-1);
        }
    return a;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = ReverseArray(a,0,4);
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
    }
}
