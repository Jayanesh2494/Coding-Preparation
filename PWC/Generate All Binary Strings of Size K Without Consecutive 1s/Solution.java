/*
 * Problem Statement:
Given an integer K, generate all possible binary strings of size K such that no two 1s are consecutive.

Example:
Input 1:
K = 3
Output:
000, 001, 010, 100, 101
Input 2:
K = 4
Output:
0000, 0001, 0010, 0100, 0101, 1000, 1001, 1010
 */

import java.util.*;
public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the K:");
        int K = sc.nextInt();
        sc.close();
        System.out.println("Binary strings of size " + K + " without consecutive 1s:");
        List<String> result = generateBinaryStrings(K);
        for (String s : result) {
            System.out.println(s);
        }
    }

    // Function to generate binary strings of size K
    public static List<String> generateBinaryStrings(int K) {
        List<String> result = new ArrayList<>();
        generateStringsHelper(K, "", result);
        return result;
    }

    // Helper function for recursive backtracking
    private static void generateStringsHelper(int K, String current, List<String> result) {
        // Base case: if the current string has reached size K, add to the result
        if (current.length() == K) {
            result.add(current);
            return;
        }

        // Recursive case: Add '0' to the current string
        generateStringsHelper(K, current + "0", result);

        // Add '1' to the current string only if the last character is not '1'
        if (current.isEmpty() || current.charAt(current.length() - 1) != '1') {
            generateStringsHelper(K, current + "1", result);
        }
    }
}
