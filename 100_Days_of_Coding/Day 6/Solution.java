/*
 * An array of N numbers is passed as input. The program must print all the LEADERS in the array. A number is a LEADER if it is greater than all the numbers to it's right.

 

Note: The rightmost number is always a leader.

 

Input Format:


The first line contains N numbers, each separated by a space.

 

Output Format:


The first line contains the LEADERS, each separated by a space.

 

Boundary Conditions:


1 <= N <= 9999

 

Example Input/Output 1:


Input:


10 17 4 3 5 2

 

Output:


17 5 2
 */

 import java.util.*;

 public class Solution {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the integers separated by space:");
         String in = sc.nextLine();
         sc.close();
         
         // Call the function
         ArrayList<Integer> result = findLeaders(in);
         
         // Print the result
         for (int i = result.size() - 1; i >= 0; i--) {
             System.out.print(result.get(i) + " ");
         }
     }
 
     // Function to find the leaders in the array
     public static ArrayList<Integer> findLeaders(String input) {
         String[] num = input.split(" ");
         int n = num.length;
         int[] arr = new int[n];
         
         for (int i = 0; i < n; i++) {
             arr[i] = Integer.parseInt(num[i]);
         }
         
         ArrayList<Integer> leaders = new ArrayList<>();
         int max = arr[n - 1];
         leaders.add(max);
         
         for (int i = n - 2; i >= 0; i--) {
             if (arr[i] > max) {
                 leaders.add(arr[i]);
                 max = arr[i];
             }
         }
         
         return leaders;
     }
 }
 