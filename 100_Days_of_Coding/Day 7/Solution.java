/*
 * Based on the input value of N, the program must print the pattern described below.

 

Input Format:


First line will contain the value of N.

 

Output Format:


N lines will contain the number pattern as described below with each value separated by a single space.

 

Boundary Conditions:


1 <= N <= 50

 

Example Input/Output 1:


Input:


5

 

Output:


1 6 10 13 15
2 7 11 14
3 8 12
4 9
5

 

Example Input/Output 2:


Input:


3

 

Output:


1 4 6
2 5
3
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        
        // Call the function
        printPattern(n);
    }

    // Function to print the pattern
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 0;
            System.out.print(i + " ");
            
            for (int j = n; j > i; j--) {
                num += j;
                System.out.print(i + num + " ");
            }
            
            System.out.println();
        }
    }
}
