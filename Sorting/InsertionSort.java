package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void Insertionsort(int arr[], int n){
       for(int i=0;i<n;i++){
           int j = i;
           while(j>0 && arr[j-1]>arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               j--;
           }
       }
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
        Insertionsort(arr,n);
        System.out.println("After Insertion Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
