/*
 * Problem Statement:
Given an unsorted integer array, print all unique elements (each element only once), regardless of their frequency in the array. The order of appearance in the output should be the same as their first occurrence in the input.

Example 1:
Input:
arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output:
12, 10, 9, 45, 2

Example 2:
Input:
arr[] = {1, 2, 3, 4, 5}
Output:
1, 2, 3, 4, 5
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Print unique elements
        printUniqueElements(arr);
    }

    // Function to print all unique elements
    public static void printUniqueElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Unique elements:");
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
                set.add(num);
            }
        }
    }
}
