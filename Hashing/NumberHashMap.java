package Hashing;
import java.util.*;
public class NumberHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = {1, 2, 2, 1, 3, 12};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(hash.containsKey(arr[i]))
                hash.put(arr[i],hash.get(arr[i])+1);
            else
                hash.put(arr[i],1);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"->"+ hash.get(arr[i]));
        }
    }
}
