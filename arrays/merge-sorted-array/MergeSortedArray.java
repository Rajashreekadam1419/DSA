/*
 * Program: Merge Two Sorted Arrays
 *
 * Description:
 * This program merges two sorted arrays into one sorted array using
 * the two-pointer technique. The result is stored in a new array.
 *
 * Time Complexity:  O(m + n)
 * Space Complexity: O(m + n)
 *
 * Example:
 * Input:  num1 = {2, 4, 6, 8,9}
 *         num2 = {1, 3, 5,7}
 * Output: 1 2 3 4 5 6 8
 */

public class MergeSortedArray {

    public static int[] merge(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (num1[i] <= num2[j]) {
                result[k++] = num1[i++];
            } else {
                result[k++] = num2[j++];
            }
        }

        while (i < m) {
            result[k++] = num1[i++];
        }

        while (j < n) {
            result[k++] = num2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {2, 4, 6, 8,9};
        int[] num2 = {1, 3, 5,7};

        int[] result = merge(num1, num2);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
