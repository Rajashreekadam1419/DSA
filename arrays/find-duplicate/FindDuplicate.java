/*
 * Find Duplicate Number using XOR
 *
 * Description:
 * This program finds the duplicate number in an array where the numbers
 * are from 1 to n and only one number is repeated. It uses the XOR
 * (bitwise exclusive OR) operation to find the duplicate in a
 * space-efficient way.
 *
 * Time Complexity: O(n)
 *     - We traverse the array once and numbers from 1 to n once.
 *
 * Space Complexity: O(1)
 *     - No extra space is used except a few variables.
 */

public class FindDuplicate {

    // Function to find duplicate using XOR
    public static int findDuplicate(int[] arr) {
        int n = arr.length - 1; // because one number is repeated
        int xorAll = 0;

        // XOR all elements in the array
        for (int num : arr) {
            xorAll ^= num;
        }

        // XOR numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        return xorAll;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number is: " + duplicate);
    }
}
