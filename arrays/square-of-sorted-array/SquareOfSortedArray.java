/*
 * Program: Squares of a Sorted Array
 *
 * Description:
 * Given a sorted array, this program returns a new array containing
 * the squares of each number in non-decreasing order. It uses the
 * two-pointer technique to build the squared array from largest to smallest.
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input:  [-4, -1, 0, 3, 10]
 * Output: [0, 1, 9, 16, 100]
 */

public class SquareOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.print("Output: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
