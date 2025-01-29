/*
 * Problem Statement:
Given a binary string consisting solely of '0's and '1's, you need to transform it into a sequence of alternating characters (010101... or 101010...) 
by flipping some of the bits. The goal is to minimize the number of bit flips required to achieve this alternating sequence.

Example:
Input 1:
Input: str = "001"
Output:
Minimum number of flips required = 1
Explanation:
Flip the first bit from '0' to '1' to get the alternating sequence 010.
One flip is required.

Input 2:
Input: str = "0001010111"
Output:
Minimum number of flips required = 2
Explanation:
Flip the 2nd bit from '0' to '1' and the 9th bit from '1' to '0' to get the alternating sequence 0101010101.
Two flips are required.
 */

 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the binary string
        System.out.println("Enter the binary string:");
        String str = sc.nextLine();

        // Calculate the minimum number of flips
        int result = minFlips(str);

        // Output the result
        System.out.println("Minimum number of flips required = " + result);

        sc.close();
    }

    public static int minFlips(String str) {
        int n = str.length();
        
        // Pattern 1: starts with 0 (010101...)
        int flipsPattern1 = 0;
        // Pattern 2: starts with 1 (101010...)
        int flipsPattern2 = 0;

        // Traverse the string and calculate the flips for both patterns
        for (int i = 0; i < n; i++) {
            char expectedCharPattern1 = (i % 2 == 0) ? '0' : '1';
            char expectedCharPattern2 = (i % 2 == 0) ? '1' : '0';

            // If the character at position i does not match pattern 1, increment the flip count for pattern 1
            if (str.charAt(i) != expectedCharPattern1) {
                flipsPattern1++;
            }

            // If the character at position i does not match pattern 2, increment the flip count for pattern 2
            if (str.charAt(i) != expectedCharPattern2) {
                flipsPattern2++;
            }
        }

        // Return the minimum of the two patterns' flip counts
        return Math.min(flipsPattern1, flipsPattern2);
    }
}
