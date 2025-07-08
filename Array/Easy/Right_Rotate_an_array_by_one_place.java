package Array.Easy;
import java.util.*;
public class Right_Rotate_an_array_by_one_place {
    static void oneRightshift(int arr[],int n){
        int i=n-1;
        int temp = arr[n-1];
        for(int j=n-2;j>=0;j--){
            arr[i--]=arr[j];
        }

        arr[0] = temp;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ebter elements into the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        oneRightshift(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
