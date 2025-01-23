/*Given an array and a threshold value find the output.

Input: {5,8,10,13,6,2}

Threshold = 3

Output count = 17

Explanation:

Number          Parts               Counts

5                {3,2}                 2

8                {3,3,2}               3

10              {3,3,3,1}              4

13             {3,3,3,3,1}             5

6                 {3,3}                2

2                   {2}                1

Input Format

N - no of elements in an array

Array of elements

Threshold value

Output Format

Display the count

Sample Input 1

6

5 8 10 13 6 2

3

Sample Output 1

17
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input:");
        int n = sc.nextInt();
        System.out.print("Enter the Array value:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Threshold value:");
        int t = sc.nextInt();
        System.out.print(calculateCount(arr, t));
    }

    public static int calculateCount(int[] arr, int t) {
        int count = 0;
        for (int num : arr) {
            count += (num + t - 1) / t; // Calculate required count for each number
        }
        return count;
    }
}
