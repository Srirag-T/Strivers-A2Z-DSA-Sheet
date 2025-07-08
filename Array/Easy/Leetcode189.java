package Array.Easy;
import java.util.*;
public class Leetcode189 {
    static void dRightshift(int arr[],int k){
     int[] temp = new int[arr.length];
     int i=0;
     for(int j= arr.length-k;j<arr.length;j++){
         temp[i++]=arr[j];
     }

     for(int j=k;j<arr.length;j++){
         temp[j] = arr[j-k];
     }

     for(int j=0;j<temp.length;j++){
         arr[j] = temp[j];
     }

    }


    static void rotate(int arr[],int k){
       k = k%arr.length;
       dRightshift(arr,k);

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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
