package Array.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheUnion {
    static int removeduplicates(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    static ArrayList union(int[] arr1,int[] arr2,int size1,int size2){
        ArrayList <Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                result.add(arr2[j]);
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;

            }
        }
        while (i < size1) {
            result.add(arr1[i]);
            i++;
        }

        while (j < size2) {
            result.add(arr2[j]);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array 1:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements into array 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of the array 2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements into array 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int size1 = removeduplicates(arr1, n1);
        int size2 = removeduplicates(arr2, n2);

        ArrayList<Integer> result = union(arr1,arr2,size1,size2);
        System.out.println("Result :");
            for (int itr : result) {
                System.out.print(itr + " ");
            }

        }
    }

