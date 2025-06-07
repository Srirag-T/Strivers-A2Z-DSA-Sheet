package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void Bubblesort(int arr[], int n){
       for(int i=0;i<n;i++){
           for(int j=0;j<i;j++){
               if(arr[j]<arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
               }
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
        Bubblesort(arr,n);
        System.out.println("After Bubble Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
