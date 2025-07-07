package Sorting;
import java.util.*;
public class QuickSort {

    public static void swapped(int arr[],int i,int j){
        int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }

    public static int paritionfunc(int arr[], int low,int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i<j){
        while(arr[i]<=pivot && i<=high){
            i++;
        }
        while(arr[j]>pivot && j>=low){
            j--;
        }
        if(i<j) {
            swapped(arr,i,j);
        }
    }
    swapped(arr,low,j);
    return j;
    }
    public static void QS(int arr[],int low,int high){
        if(low<high){
            int pIdx = paritionfunc(arr,low,high);
            QS(arr,low,pIdx-1);
            QS(arr,pIdx+1,high);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter Values into array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        QS(arr,0,n-1);
        System.out.println("After Quick Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
