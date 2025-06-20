/*
 * Problem Statement:
Given an unsorted array arr[] of size n containing integers from 1 to n, sort the array in ascending order in O(n) time and O(1) space.

You cannot replace elements with new values, only rearrange the existing ones.

Example 1:
Input:
arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1}
Output:
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

Example 2:
Input:
arr[] = {4, 3, 2, 1}
Output:
arr[] = {1, 2, 3, 4}

Constraints:
The array must only be rearranged; no new elements can be introduced.
The array size n is guaranteed to have integers between 1 and n without duplicates.

 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (between 1 and " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Call the function to sort the array
        cyclicSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to perform Cyclic Sort
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Calculate the correct index for the current element
            int correctIndex = arr[i] - 1;

            // If the current element is not at the correct index, swap it
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                // Move to the next element
                i++;
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
