/*
 Given a number N, the program must print if N is a step number or not. (A step number is a number which has a digit which is either 1 more or 1 less than the previous digit).

Input Format:

The first line contains N.

Output Format:

The first line contains yes or no

Boundary Conditions:

10 <= N <= 99999999

Example Input/Output 1:

Input:

1212343

Output:

yes

Example Input/Output 2:

Input:

342345

Output:

no

Explanation:

The difference between 2 and 4 is NOT 1.

 */

 import java.util.*;

 public class Solution {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the input:");
         int n = sc.nextInt();
         System.out.print(isConsecutiveDigits(n));
     }
 
     public static String isConsecutiveDigits(int n) {
         boolean flag = true;
         if (n < 10) return "yes";
 
         int currDigit = n % 10; // Last digit
         n /= 10;
 
         while (n > 0) {
             int prevDigit = n % 10; // Previous digit
             if (Math.abs(prevDigit - currDigit) != 1) {
                 flag = false;
                 break;
             }
             currDigit = prevDigit; // Update the current digit
             n /= 10;
         }
         return flag ? "yes" : "no";
     }
 }
 
