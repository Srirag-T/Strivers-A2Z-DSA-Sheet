package Array.Easy;

import java.util.Scanner;

public class LongestSubarrayWithGivenSumK_positives {
    static int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        return n2;
    }
    static int longestsubarray(int[] arr, int x){
        int maximum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                  sum = sum+arr[k];
                }
                if(sum==x){
                    maximum = max(maximum,j-i+1);
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value:");
        int x = sc.nextInt();
        int result = longestsubarray(arr,x);
        System.out.println("length of the longest sub-array that sums to "+x+" is "+result);
    }
}

