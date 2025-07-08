package Array.Easy;
import java.util.*;
public class Leetcode189 {
    static void oneRightshift(int arr[],int n){
        int i=n-1;
        int temp = arr[n-1];
        for(int j=n-2;j>=0;j--){
            arr[i--]=arr[j];
        }

        arr[0] = temp;

    }


    static void rotate(int arr[],int k){
        for(int i=0;i<k;i++){
            oneRightshift(arr,arr.length);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ebter elements into the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of times to rotate array:");
        int k = sc.nextInt();
        rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
