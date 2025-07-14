package Array.Easy;
import java.util.*;
public class MissingNumber {
    static int Missingnumber(int[] arr,int n){
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                flag=1;
                break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
            int N = 5;
            int arr[] = {1, 2, 4, 5};

            int ans = Missingnumber(arr, N);
            System.out.println("The missing number is: " + ans);
    }
}
