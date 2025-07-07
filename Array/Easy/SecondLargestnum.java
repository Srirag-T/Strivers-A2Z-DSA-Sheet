package Array.Easy;

import java.util.Scanner;

public class SecondLargestnum {

    static int SecondLargestelement(int arr[], int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
                max = arr[i];
        }
        int secondlargest = -1;
        for(int i=0;i<n;i++){
            if(secondlargest<arr[i] && arr[i]!=max)
                secondlargest = arr[i];
        }
        return secondlargest;
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
        int result = SecondLargestelement(arr,n);
        System.out.println("Second Largest Element -> "+result);
    }
}
