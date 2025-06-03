package Recursion;
import java.util.*;
public class ParameterizedRecursion {
    static void Sum(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        Sum(n-1,sum+n);

    }
    public static void main(String[] args){
        int n=3;
        Sum(n,0);
    }


}
