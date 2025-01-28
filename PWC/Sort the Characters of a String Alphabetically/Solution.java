/*
 * Problem Statement:
Write a program to take a string consisting of lowercase characters (from 'a' to 'z') as input and output its characters in sorted order.

Example:
Input 1:
Input: bbccdefbbaa
Output: aabbbbccdef
Input 2:
Input: geeksforgeeks
Output: eeeefggkkorss
 */

 import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        // Sort the string and get the result
        String sortedString = sortString(input);

        // Print the sorted string
        System.out.println("Output: " + sortedString);

        sc.close();
    }

    // Function to sort the characters of a string
    public static String sortString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted array back to a string
        return new String(charArray);
    }
}
