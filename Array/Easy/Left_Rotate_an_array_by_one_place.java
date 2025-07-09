package Array.Easy;
import java.util.*;
public class Left_Rotate_an_array_by_one_place {
    static void oneleftshift(int arr[],int n){
        int i=0;
        int temp = arr[0];
        for(int j=1;j<n;j++){
            arr[i++]=arr[j];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        oneleftshift(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
