/*
 * Program: Find Unique Number in an Array
 *
 * Description:
 * Given an array where every element appears twice except for one element that appears only once,
 * this program finds and returns that unique element.
 * It uses the XOR operator so that duplicates cancel out,
 * leaving only the unique element.
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:  {1,1,6,2,3,4,5,3,5,4,6}
 * Output: 2
 */

public class FindUnique {

    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR accumulates values
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,6,2,3,4,5,3,5,4,6};

        int uniqueNum = findUnique(arr);

        System.out.println("Unique number is: " + uniqueNum);
    }
}
