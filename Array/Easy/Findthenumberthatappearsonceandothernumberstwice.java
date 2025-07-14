package Array.Easy;
import java.util.*;
public class Findthenumberthatappearsonceandothernumberstwice {
    //Brute Force
//    static int func(int[] arr){
//        HashMap <Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm.containsKey(arr[i])){
//                hm.put(arr[i],hm.get(arr[i])+1);
//            }
//            else{
//                hm.put(arr[i],1);
//            }
//        }
//
//        for(int key : hm.keySet()){
//            if(hm.get(key) == 1){
//                return key;
//            }
//        }
//
//        return -1;
//    }
//
    //Optimal
    static int func(int[] arr) {
        int resultxor = 0;
        for (int i = 0; i < arr.length; i++) {
            resultxor ^= arr[i];
        }

        return resultxor;
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
        int result = func(arr);
        System.out.println("1 time appeared -> "+result);
    }
}
