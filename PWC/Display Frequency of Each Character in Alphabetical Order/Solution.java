/*
 * Problem Statement:
Write a program that takes a string as input and displays the frequency of each character in the string, organized in alphabetical order. The string consists of lowercase letters ('a' to 'z').

Example:
Input 1:
Input: str = "aabccccddd"
Output 1:
a2b1c4d3
Input 2:
Input: str = "geeksforgeeks"
Output 2:
e4f1g2k2o1r1s2
 */

 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Call the function to calculate and display frequency
        displayCharacterFrequency(str);

        sc.close();
    }

    public static void displayCharacterFrequency(String str) {
        // Create an array to store the frequency of each character
        int[] freq = new int[26];

        // Traverse the string and update the frequency array
        for (char c : str.toCharArray()) {
            freq[c - 'a']++; // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
        }

        // Build and display the output in alphabetical order
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) { // Only include characters with non-zero frequency
                result.append((char) (i + 'a')).append(freq[i]);
            }
        }

        // Print the result
        System.out.println("Output: " + result.toString());
    }
}
