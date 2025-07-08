package Array.Easy;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    static int RemoveDuplicates(int arr[],int n){
        int i=0;
        int counter=1;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
                counter++;
            }
        }
        return counter;
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
        int result = RemoveDuplicates(arr,n);
        System.out.print(result);
    }
}
