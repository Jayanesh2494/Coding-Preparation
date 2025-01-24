/*
A positive integer N is passed as the input. If we print all the numbers from 1 to N continuously, the program must find the number of characters (digits) C printed and print the count C as the output.

 

Input Format:


The first line contains N.

 

Output Format:


The first line contains C.

 

Boundary Conditions:


1 <= N <= 9999999

 

Example Input/Output 1:


Input:


2

 

Output:


2

 

Explanation:


We print 12 and hence the total number of characters is 2.

 

Example Input/Output 2:


Input:


15

 

Output:


21

 

Explanation:


We print 123456789101112131415 and hence the total number of characters is 21.
 */

 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input");
        int n = sc.nextInt();
        System.out.print(countTotalDigits(n));
    }

    public static int countTotalDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += String.valueOf(i).length(); 
        }
        return count;
    }
}
