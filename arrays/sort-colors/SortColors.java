/*
Sort Colors Program (Dutch National Flag Problem)
Description: Sorts an array containing 0,1,2 such that all 0s come first, then 1s, then 2s
Time Complexity: O(n) - single pass through the array
Space Complexity: O(1) - in-place swaps
*/


class SortColors{

    public static void sortColors(int[] nums)
    {
        int low=0, mid=0, high=nums.length-1;
        while (mid<=high) 
            {
                if(nums[mid]==0)
                {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }

               else  if(nums[mid]==1)
                {
                    mid++;
                }
                else
                {
                        swap(nums, mid, high);
                        high--;
                    }
                }
            
        }
    

    private static void swap(int[] nums, int i, int j)
    {
        int temp =nums[i];
        nums[i] =nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
    int[] nums = {0, 1, 2, 1, 0, 2, 0};

    // Show original array
    System.out.print("Original Colors: ");
    for (int num : nums) {
        System.out.print(num + " ");
    }
    System.out.println(); 

    // Sort the array
    sortColors(nums);

    // Show sorted array
    System.out.print("Sorted Colors:   ");
    for (int num : nums) {
        System.out.print(num + " ");
    }
}

}
