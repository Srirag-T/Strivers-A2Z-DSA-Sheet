package Array.Easy;

import java.util.Scanner;

public class Largestnum {

    static int Largestelement(int arr[],int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
                max = arr[i];
        }

        return max;
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
        int result = Largestelement(arr,n);
        System.out.println("Max Element -> "+result);
    }
}
