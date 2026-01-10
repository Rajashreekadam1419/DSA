/*
Find Missing Number in Array
Description: Given an array containing numbers from 1 to n with one number missing, finds the missing number.
Time Complexity: O(n) - single pass through the array
Space Complexity: O(1) - constant extra space
*/

import java.util.Scanner;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum; // Missing number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array (n-1):");
        int nMinusOne = scanner.nextInt();
        int n = nMinusOne + 1; // actual size including missing number

        int[] arr = new int[nMinusOne];

        System.out.println("Enter the array elements (from 1 to " + n + " with one missing):");
        for (int i = 0; i < nMinusOne; i++) {
            arr[i] = scanner.nextInt();
        }

        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);

        scanner.close();
    }
}
