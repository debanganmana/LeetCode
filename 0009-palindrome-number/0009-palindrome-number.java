class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        // Reverse only the second half of the number to prevent integer overflow
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + (x % 10);
            x /= 10;
        }

        // For even lengths: x == reversedNum
        // For odd lengths: x == reversedNum / 10 (removes the middle digit)
        return x == reversedNum || x == reversedNum / 10;
    }
}
