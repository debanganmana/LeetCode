public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Initialize pointers at both ends of the array
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // Problem requires 1-indexed results
                return new int[] {left + 1, right + 1 };
            } else if (currentSum > target) {
                // Sum is too large, move the right pointer inward to get a smaller value
                right--;
            } else {
                // Sum is too small, move the left pointer inward to get a larger value
                left++;
            }
        }
        
        return new int[] {}; // Fallback, though the problem guarantees exactly one solution
    }
}
