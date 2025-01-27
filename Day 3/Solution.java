/*
 Given a number, convert it into corresponding alphabet.

Input                 Output

1                       A

26                      Z

27                      AA

676                     YZ

Input Format

Input is an integer

Output Format

Print the alphabets

Constraints

1 <= num <= 4294967295

Sample Input 1

26

Sample Output 1

Z
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input:");
        int n = sc.nextInt();
        sc.close();
        System.out.print(convertToTitle(n));
    }

    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            n--; // To handle 1-based indexing
            result.append((char) ('A' + (n % 26))); // Convert to corresponding character
            n /= 26; // Move to the next digit
        }

        return result.reverse().toString(); // Reverse the string for correct output
    }
}
