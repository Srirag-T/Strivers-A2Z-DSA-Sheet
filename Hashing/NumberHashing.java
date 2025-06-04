package Hashing;

public class NumberHashing {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,2};
        int[] hash = new int[13];
        int n = arr.length;
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]+" -> "+hash[arr[i]]);
        }
    }
}
