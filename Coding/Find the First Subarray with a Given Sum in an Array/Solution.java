/*
 * Problem Statement:
Given an array of non-negative integers arr[] and an integer sum, find a subarray (contiguous elements) that sums up to the given sum. 
If there are multiple subarrays with the same sum, return the first such subarray. If no such subarray exists, print "No subarray found".

Example 1:
Input:
arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output:
Sum found between indexes 2 and 4
Explanation:
Subarray = {20, 3, 10} → 20 + 3 + 10 = 33

Example 2:
Input:
arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output:
Sum found between indexes 1 and 4
Explanation:
Subarray = {4, 0, 0, 3} → 4 + 0 + 0 + 3 = 7

Example 3:
Input:
arr[] = {1, 4}, sum = 0
Output:
No subarray found
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

        // Input the target sum
        System.out.println("Enter the target sum:");
        int targetSum = sc.nextInt();
        sc.close();

        // Find and print the subarray
        findSubarrayWithGivenSum(arr, targetSum);
    }

    public static void findSubarrayWithGivenSum(int[] arr, int targetSum) {
        int currentSum = 0; // To store the sum of the current subarray
        int start = 0;      // Pointer to the start of the window

        // Traverse the array
        for (int end = 0; end < arr.length; end++) {
            // Add the current element to currentSum
            currentSum += arr[end];

            // Shrink the window as long as currentSum > targetSum
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if the current sum equals the target sum
            if (currentSum == targetSum) {
                System.out.println("Sum found between indexes " + start + " and " + end);
                return;
            }
        }

        // If no subarray is found
        System.out.println("No subarray found");
    }
}
