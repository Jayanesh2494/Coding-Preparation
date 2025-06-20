/*
 * Problem Statement:
Given a string s of size n and an integer d, perform the following operations:

Left (or anticlockwise) rotation: Rotate the string left by d elements.
Right (or clockwise) rotation: Rotate the string right by d elements.
Constraints:
The number of rotations, d, satisfies 0 <= d <= n.
If d > n, the rotations wrap around (e.g., rotating a string of length n by d = n + 1 is equivalent to rotating by d = 1).

Example Input and Output:
Input 1:
Enter the string:
qwertyu
Enter the number of rotations:
2

Output 1:
Left rotation: ertyuqw
Right rotation: yuqwert



Input 2:
Enter the string:
abcdefg
Enter the number of rotations:
4

Output 2:
Left rotation: efgabcd
Right rotation: defgabc
 */

 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Input the number of rotations
        System.out.println("Enter the number of rotations:");
        int d = sc.nextInt();

        // Validate the number of rotations
        d = d % s.length(); // If d > n, wrap it around

        // Perform the rotations
        String leftRotated = leftRotate(s, d);
        String rightRotated = rightRotate(s, d);

        // Print the results
        System.out.println("Left rotation: " + leftRotated);
        System.out.println("Right rotation: " + rightRotated);

        sc.close();
    }

    // Function to perform left rotation
    public static String leftRotate(String s, int d) {
        // Divide the string into two parts: [0:d] and [d:]
        return s.substring(d) + s.substring(0, d);
    }

    // Function to perform right rotation
    public static String rightRotate(String s, int d) {
        // Right rotation by d is equivalent to left rotation by (n - d)
        int n = s.length();
        return s.substring(n - d) + s.substring(0, n - d);
    }
}
