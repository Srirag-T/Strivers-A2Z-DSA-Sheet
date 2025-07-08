package Array.Easy;
import java.util.*;
public interface CheckIfTheArrayIsSorted {
    static boolean check(int arr[], int n) {
        for (int i = 1; i < n ; i++) {
            if (arr[i] >=arr[i - 1] ) {
            }
            else{
                return false;
            }
        }
        return true;
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
