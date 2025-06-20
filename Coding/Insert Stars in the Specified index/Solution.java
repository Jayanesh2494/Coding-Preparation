/*
 * Problem Statement:
Given a string str and an array of indices chars[], write a program to insert stars (*) before the characters at the specified indices. Return the modified string after these stars have been added.

Example:
Input 1:
str = "spacing"
chars = [0, 1, 2, 3, 4, 5, 6]
Output 1:
*s*p*a*c*i*n*g

Input 2:
str = "hello"
chars = [1, 4]
Output 2:
h*ell*o
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Input the number of indices
        System.out.println("Enter the number of indices:");
        int n = sc.nextInt();

        // Input the indices array
        System.out.println("Enter the indices (space-separated):");
        int[] chars = new int[n];
        for (int i = 0; i < n; i++) {
            chars[i] = sc.nextInt();
        }

        // Get the modified string with stars inserted
        String result = insertStars(str, chars);

        // Output the result
        System.out.println("Modified string: " + result);

        sc.close();
    }

    public static String insertStars(String str, int[] chars) {
        // Sort the indices array to ensure proper order
        Arrays.sort(chars);

        StringBuilder result = new StringBuilder();
        int n = str.length();
        int indexPointer = 0;

        // Traverse the string
        for (int i = 0; i < n; i++) {
            // Check if the current index is in the chars array
            if (indexPointer < chars.length && chars[indexPointer] == i) {
                result.append('*'); // Insert a star
                indexPointer++;    // Move to the next index in chars[]
            }
            // Append the current character
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
