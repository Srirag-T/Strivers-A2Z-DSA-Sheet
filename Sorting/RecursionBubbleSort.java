package Sorting;

import java.util.Scanner;

public class RecursionBubbleSort {
    public static void Bubblesort(int arr[], int n){
        if(n==1)
            return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        Bubblesort(arr,n-1);

}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter Values into array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();;
        }
        Bubblesort(arr,n);
        System.out.println("After Bubble Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
