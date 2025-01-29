/*
 * Problem Statement:
Create a program to generate all bit patterns of size N (ranging from 0 to 2^N - 1) such that each successive pattern differs from the previous one by exactly one bit. This sequence is known as the Gray Code.

Example:
Input 1:
N = 2
Output 1:
00, 01, 11, 10

Input 2:
N = 3
Output 2:
000, 001, 011, 010, 110, 111, 101, 100
 */

 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of bits
        System.out.println("Enter the number of bits (N):");
        int N = sc.nextInt();

        // Generate Gray Code sequence
        List<String> grayCodeSequence = generateGrayCode(N);

        // Output the result
        System.out.println("Gray Code sequence for " + N + " bits:");
        for (String code : grayCodeSequence) {
            System.out.println(code);
        }

        sc.close();
    }

    // Function to generate Gray Code sequence for N bits
    public static List<String> generateGrayCode(int N) {
        List<String> result = new ArrayList<>();
        int total = 1 << N; // 2^N

        // Generate Gray Code for all numbers from 0 to 2^N - 1
        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1); // Calculate Gray Code
            result.add(toBinaryString(gray, N)); // Convert to binary string
        }

        return result;
    }

    // Helper function to convert a number to its binary string representation of length N
    public static String toBinaryString(int num, int N) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(num));

        // Pad with leading zeros to ensure the string is of length N
        while (binary.length() < N) {
            binary.insert(0, '0');
        }

        return binary.toString();
    }
}
