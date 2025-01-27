/*
 * Problem Statement:
Given an unsorted array of integers, sort the array into a wave array, where the elements follow an up-down pattern:

arr[0] >= arr[1] <= arr[2] >= arr[3] ...
Input:
An unsorted array of integers.
Output:
An array rearranged into wave form, such that the up-down pattern is maintained.

Example 1:
Input:
arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output:
arr[] = {10, 5, 6, 2, 20, 3, 100, 80}

Example 2:
Input:
arr[] = {20, 10, 8, 6, 4, 2}
Output:
arr[] = {20, 8, 10, 4, 6, 2}

 */

//  import java.util.*;

//  public class Solution {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the size of the array:");
//          int n = sc.nextInt();
//          int[] arr = new int[n];
         
//          System.out.println("Enter the elements of the array:");
//          for (int i = 0; i < n; i++) {
//              arr[i] = sc.nextInt();
//          }
//          sc.close();
         
//          // Call the function to sort the array into wave form
//          waveSort(arr);
         
//          // Print the resulting wave array
//          System.out.println("Array after wave sort:");
//          for (int num : arr) {
//              System.out.print(num + " ");
//          }
//      }
 
//      // Function to sort the array into wave form
//      public static void waveSort(int[] arr) {
//          // Step 1: Sort the array
//          Arrays.sort(arr);
         
//          // Step 2: Swap adjacent elements
//          for (int i = 0; i < arr.length - 1; i += 2) {
//              // Swap arr[i] and arr[i+1]
//              int temp = arr[i];
//              arr[i] = arr[i + 1];
//              arr[i + 1] = temp;
//          }
//      }
//  }


 // METHOD 2

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        // Call the function to sort the array into wave form
        waveSort(arr);
        
        // Print the resulting wave array
        System.out.println("Array after wave sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void waveSort(int[] arr) {
        int n = arr.length;
        
        // Traverse all elements and adjust as needed
        for (int i = 0; i < n; i += 2) {
            // If the current element is smaller than the previous one
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            
            // If the current element is smaller than the next one
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

 