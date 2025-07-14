package Array.Easy;
import java.util.*;
public class MissingNumber {
    // Brute Force
//    static int Missingnumber(int[] arr,int n){
//        for(int i=1;i<=n;i++){
//            int flag=0;
//            for(int j=0;j<n-1;j++){
//                if(arr[j]==i){
//                flag=1;
//                break;
//                }
//            }
//            if(flag==0){
//                return i;
//            }
//        }
//        return -1;
//    }

    // Better
//    static int Missingnumber(int[] arr,int n){
//        HashMap <Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            hm.put(arr[i],1);
//        }
//        for(int i=1;i<=n;i++){
//            if(!hm.containsKey(i)){
//                return i;
//            }
//        }  return -1;
//
//    }

//    //Optimal 1
//    static int Missingnumber(int[] arr,int n) {
//        int sum1 = (n*(n+1))/2;
//        int sum2 = 0;
//        for(int i=0;i< arr.length;i++){
//            sum2=sum2+arr[i];
//        }
//        return sum1-sum2;
//    }

    //Optimal 2
    static int Missingnumber(int[] arr, int n){
        int result1 = 0;
        for(int i=1;i<=n;i++){
            result1 = result1 ^ i;

        }

        int result2 = 0;
        for(int i=0;i<arr.length-1;i++){
            result1 = result2 ^ arr[i];
        }

        return result1 ^ result2;


    }

    public static void main(String[] args){
            int N = 5;
            int arr[] = {1, 2, 4, 5};

            int ans = Missingnumber(arr, N);
            System.out.println("The missing number is: " + ans);
    }
}
