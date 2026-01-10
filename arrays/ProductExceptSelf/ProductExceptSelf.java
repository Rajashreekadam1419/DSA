/*
Product Except Self
Description: Returns an array such that result[i] is the product of all elements except nums[i]
Time Complexity: O(n) - two passes through the array
Space Complexity: O(n) - result array of size n
*/



public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n];

        // Calculate left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
