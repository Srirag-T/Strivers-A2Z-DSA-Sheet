package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int arr[],int low,int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        System.out.println(low+" "+mid+" "+high);
        merge(arr,low,mid,high);
    }

    public static void merge(int arr[],int low,int mid,int high){
        ArrayList <Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <=mid && right <=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
       while(left<=mid){
           temp.add(arr[left]);
           left++;
       }
       while(right<=high){
           temp.add(arr[right]);
           right++;
       }
       for(int i=low;i<=high;i++){
           arr[i] = temp.get(i-low);
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
        mergeSort(arr,0,n-1);
        System.out.println("After Merge Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
