package Array.Easy;

import java.util.Scanner;

public class MoveZerostoEnd_Optimal {

    static void swapped(int arr[],int i,int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    static void MoveZeros(int[] arr, int n){
        int j=-1;
        int i=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(j=i+1;j<n;j++){
            if(arr[i]==0 && arr[j]!=0){
                swapped(arr,i,j);
                i++;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MoveZeros(arr,n);
        System.out.println("After the function: ");
        for(int i=0;i<n;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
