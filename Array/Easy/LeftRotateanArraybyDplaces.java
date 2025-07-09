package Array.Easy;
import java.util.*;
public class LeftRotateanArraybyDplaces {
    static void Dleftshift(int[] arr,int d){
        int[] temp = new int[d];
        for(int itr = 0;itr<d;itr++){
            temp[itr] = arr[itr];
        }
        for(int itr=d;itr<arr.length;itr++){
            arr[itr-d] = arr[itr];
        }
        for(int itr= arr.length-d;itr<arr.length;itr++){
            arr[itr] = temp[itr-d-1];
         }
    }
    static void rotate(int[] arr,int d){
        int n = arr.length;
        d = d % n;
        Dleftshift(arr,d);
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements into the array: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter no of left shifts: ");
            int d = sc.nextInt();
            rotate(arr,d);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
