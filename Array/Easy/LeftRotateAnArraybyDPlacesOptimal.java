package Array.Easy;

import java.util.Scanner;

public class LeftRotateAnArraybyDPlacesOptimal {
        static void reverse(int[] arr, int low, int high){
            while (low <high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    static void rotate(int[] arr,int d){
        int n = arr.length;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of left shifts: ");
        int d = sc.nextInt();
        rotate(arr,d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
