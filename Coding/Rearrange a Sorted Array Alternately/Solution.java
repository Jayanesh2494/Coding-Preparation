/*
 * Problem Statement:
Given a sorted array of positive integers, rearrange the array alternately such that:

The first element is the maximum value.
The second element is the minimum value.
The third element is the second maximum value.
The fourth element is the second minimum value.
And so on...

Input:
A sorted array of positive integers.

Output:
The array rearranged alternately with maximum and minimum values.

Example 1:
Input:
arr[] = {1, 2, 3, 4, 5, 6, 7}
Output:
arr[] = {7, 1, 6, 2, 5, 3, 4}

Example 2:
Input:
arr[] = {1, 2, 3, 4, 5, 6}
Output:
arr[] = {6, 1, 5, 2, 4, 3}
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        // Call the function to rearrange the array
        rearrangeArrayAlternately(arr);
        
        // Print the resulting array
        System.out.println("Array after rearranging alternately:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to rearrange the array alternately
    public static void rearrangeArrayAlternately(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        // Two pointers, one at the start and one at the end
        int left = 0, right = n - 1;
        int index = 0;

        // Rearranging elements alternately
        while (left <= right) {
            if (index % 2 == 0) {
                result[index] = arr[right--];  // Take the maximum element
            } else {
                result[index] = arr[left++];   // Take the minimum element
            }
            index++;
        }

        // Copying the result back into the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
