package Array.Easy;
import java.util.*;
public class LinearSearch {
    static int Linearsearch(int arr[],int key){
        int n = arr.length;
        int idx = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                idx = i;
                break;
            }
        }
        return idx;
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
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        int idx = Linearsearch(arr,key);
        System.out.println("First occurrence of "+key+" is a index "+idx);
    }
}
