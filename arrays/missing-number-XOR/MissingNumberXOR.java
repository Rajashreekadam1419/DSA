/*
Time Complexity: O(n)
- The algorithm runs in a single loop over the array.

Space Complexity: O(1)
- Only one variable is used; no extra memory is required.

Approach:
- XOR all array elements with numbers from 1 to n.
- Duplicate numbers cancel each other.
- The remaining value is the missing number.
*/

class MissingNumberXOR {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};
        int n = 6;

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];     // XOR array elements
            xor ^= (i + 1);    // XOR numbers from 1 to n-1
        }

        xor ^= n; // XOR last number

        System.out.println("Missing number is: " + xor);
    }
}
