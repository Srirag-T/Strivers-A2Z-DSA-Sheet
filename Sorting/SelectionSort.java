package Sorting;
import java.util.*;
public class SelectionSort {
    public static void Selectionsort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int minValue = i;
          for(int j=i+1;j<n;j++){
              if(arr[j]<arr[minValue]){
                  minValue = j;
              }
          }
          int temp = arr[i];
          arr[i] = arr[minValue];
          arr[minValue] =temp;
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
        Selectionsort(arr,n);
        System.out.println("After Selection Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
