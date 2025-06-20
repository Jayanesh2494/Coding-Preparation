/*
 * Problem Statement:
Given a binary string consisting solely of 0s and 1s, write a program to determine the minimum number of flips 
required to make all characters in the string identical. A flip changes a 0 to 1 or a 1 to 0.

Example:
Input 1:
Input: 00011110001110
Output: 2
Explanation:

To make the string consist entirely of 0s:
Convert the sequences of 1s into 0s. There are 2 groups of 1s.
To make the string consist entirely of 1s:
Convert the sequences of 0s into 1s. There are 3 groups of 0s.
Minimum flips = min(2, 3) = 2.

Input 2:

Input: 010101100011
Output: 4
Explanation:
To make the string consist entirely of 0s:
Convert the sequences of 1s into 0s. There are 4 groups of 1s.
To make the string consist entirely of 1s:
Convert the sequences of 0s into 1s. There are 4 groups of 0s.
Minimum flips = min(4, 4) = 4.

 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the binary string
        System.out.println("Enter the binary string:");
        String str = sc.nextLine();

        // Calculate the minimum number of flips
        int result = minFlipsToUniform(str);

        // Output the result
        System.out.println("Minimum number of flips required: " + result);

        sc.close();
    }

    public static int minFlipsToUniform(String str) {
        // Initialize counters for groups of 0's and 1's
        int count0 = 0, count1 = 0;

        // Count groups of 0's and 1's
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                // Count the start of a new group of 0's
                if (i == 0 || str.charAt(i - 1) != '0') {
                    count0++;
                }
            } else {
                // Count the start of a new group of 1's
                if (i == 0 || str.charAt(i - 1) != '1') {
                    count1++;
                }
            }
        }

        // Return the minimum of the two group counts
        return Math.min(count0, count1);
    }
}
