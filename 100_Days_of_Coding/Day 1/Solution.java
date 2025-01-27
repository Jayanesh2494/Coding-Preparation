/*
 Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.

Input Format

Input contains the array size, no of elements and the window size

Output Format

Print the maximum of numbers

Constraints

1 <= size <= 1000                        

Sample Input 1

8

1 3 5 2 1 8 6 9

3

Sample Output 1

5 5 5 8 8 9
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input:");
        int n = sc.nextInt();
        System.out.print("Enter the Array value:");
        int arr[] = new int[n]; // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k value:");
        int k = sc.nextInt(); // Size of the sliding window
        sc.close();
        printMaxInSlidingWindow(arr, n, k);
    }

    public static void printMaxInSlidingWindow(int[] arr, int n, int k) {
        for (int i = 0; i <= n - k; i++) { // Sliding window starts at index `i`
            int max = 0;
            for (int j = i; j < i + k; j++) { // Loop through the current window
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
