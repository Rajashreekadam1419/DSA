/*
 * Two Sum using Two Pointer Technique
 *
 * Description:
 * This program finds two numbers in a SORTED array
 * whose sum is equal to a given target value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 
 */

class TwoSum {

    public static void twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " " + arr[right]);
                return;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8}; // sorted array
        int target = 7;

        twoSum(arr, target);
    }
}
