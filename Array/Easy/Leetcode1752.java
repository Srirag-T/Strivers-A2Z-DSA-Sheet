package Array.Easy;
import java.util.*;
public interface Leetcode1752 {
    static boolean check(int arr[], int n) {
        int inverse = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] >=arr[i - 1]) {
            }
            else{
                inverse++;
            }
        }
        if(arr[0]<arr[n-1]){
            inverse++;
        }
        if(inverse == 1 || inverse == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = check(arr,n);
        System.out.println(result);
    }
}
