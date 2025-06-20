/*
 * Problem Statement:
Given an array arr[] of integers, segregate the even and odd numbers such that:

All even numbers appear first.
All odd numbers appear after the even numbers, maintaining their relative order.
Input:
A list of integers (arr[]).
Output:
The list with all even numbers at the beginning and odd numbers at the end, maintaining the relative order of even and odd numbers within their respective groups.

Example 1:
Input:
arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
Output:
2 4 6 8 7 9 1 3 5

Example 2:
Input:
arr[] = {1, 3, 2, 4, 7, 6, 9, 10}
Output:
2 4 6 10 7 1 9 3
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
        
        // Call the function to segregate even and odd numbers
        segregateEvenOddStable(arr);
        
        // Print the resulting array
        System.out.println("Array after segregation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to segregate even and odd numbers (stable approach)
    public static void segregateEvenOddStable(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int evenIndex = 0, oddIndex = 0;

        // Count the number of even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                oddIndex++;
            }
        }

        // Initialize oddIndex after all even numbers
        oddIndex = n - oddIndex;

        // Traverse the array and place even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex++] = num;
            }
        }

        // Copy result array back to arr
        System.arraycopy(result, 0, arr, 0, n);
    }
}
