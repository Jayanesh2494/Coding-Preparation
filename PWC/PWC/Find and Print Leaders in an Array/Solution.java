/*
 * Problem Statement:
Write a program to identify and print all leaders in an array. An element is considered a leader if it is greater than or equal to all the elements to its right. The rightmost element is always considered a leader.

Example 1:
Input:
arr[] = {16, 17, 4, 3, 5, 2}
Output:
17, 5, 2

Example 2:
Input:
arr[] = {1, 2, 3, 4, 5, 2}
Output:
5, 2
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

        // Call the function to find and print leaders
        printLeaders(arr);
    }

    // Function to find and print leaders in the array
    public static void printLeaders(int[] arr) {
        int n = arr.length;

        // List to store the leaders
        List<Integer> leaders = new ArrayList<>();

        // Start with the last element as a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse the list to maintain the correct order of leaders
        Collections.reverse(leaders);

        // Print the leaders
        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
