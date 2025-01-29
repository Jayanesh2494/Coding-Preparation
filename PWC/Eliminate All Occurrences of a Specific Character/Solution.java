/*
 * Problem Statement:
Given a string s and a character c, write a program to eliminate all occurrences of the character c from the string s. Return the modified string.

Example:
Input 1:
Input: s = "sustainability", c = 'i'
Output 1:
Output: "sustanablty"
Input 2:
Input: s = "hello world", c = 'o'
Output 2:
Output: "hell wrld"
 */
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string and character to eliminate
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        
        System.out.println("Enter the character to eliminate:");
        char c = sc.next().charAt(0);

        // Eliminate the character and get the modified string
        String result = eliminateCharacter(s, c);

        // Output the result
        System.out.println("Modified string: " + result);

        sc.close();
    }

    public static String eliminateCharacter(String s, char c) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Traverse the string and append characters that are not 'c'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                result.append(s.charAt(i));
            }
        }

        // Convert StringBuilder to string and return
        return result.toString();
    }
}
