package Array.Easy;
import java.util.*;
public class MaximumConsecutiveOnes {
    static int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        return n2;
    }
    static int Consecutiveones(int[] arr) {
        int counter = 0;
        int maxc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                maxc = max(counter,maxc);
            } else {
                counter = 0;
            }
        }

    return maxc;



    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = Consecutiveones(arr);
        System.out.println("Maximum Consecutive Ones are "+result);
    }


}
