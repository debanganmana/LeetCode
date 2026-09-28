
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Create a 2D array to store [number, original_index]
        int[][] sortedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }
        
        // 2. Sort the array based on the numbers
        Arrays.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));
        
        // 3. Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        
        // 4. Shrink the window until the pointers meet
        while (left < right) {
            int currentSum = sortedNums[left][0] + sortedNums[right][0];
            
            if (currentSum == target) {
                // Return the original indices stored in the second column
                return new int[] { sortedNums[left][1], sortedNums[right][1] };
            } else if (currentSum < target) {
                left++; // Move left pointer right to get a larger sum
            } else {
                right--; // Move right pointer left to get a smaller sum
            }
        }
        
        return new int[] {};
    }
}
