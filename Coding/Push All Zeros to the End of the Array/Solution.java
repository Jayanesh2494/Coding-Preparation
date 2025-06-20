/*
Problem Statement:
Given an array of integers, push all the zeros to the end of the array without changing the order of the other elements. The time complexity should be O(n), and the extra space complexity should be O(1).

Input:
An array of integers, where some elements are zero.

Output:
The modified array where all zeros are moved to the end, and the order of non-zero elements is maintained.

Example 1:
Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0}
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0}

Example 2:
Input: arr[] = {1, 2, 0, 0, 0, 3, 6}
Output: arr[] = {1, 2, 3, 6, 0, 0, 0}
 */

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
        
        // Call the function to push zeros to the end
        pushZerosToEnd(arr);
        
        // Print the resulting array
        System.out.println("Array after pushing zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to push all zeros to the end
    public static void pushZerosToEnd(int[] arr) {
        int lastNonZeroIndex = 0;  // This will track the position for non-zero elements
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[lastNonZeroIndex] if arr[i] is non-zero
                int temp = arr[i];
                arr[i] = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = temp;
                
                // Increment the lastNonZeroIndex
                lastNonZeroIndex++;
            }
        }
    }
}
