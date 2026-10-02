public class Solution {
    public boolean isPalindrome(String s) {
        // Initialize pointers at both ends of the string
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Step 1: If left character is not a letter or digit, skip it
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Step 2: If right character is not a letter or digit, skip it
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // Step 3: Both are valid. Compare them in lowercase.
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Found a mismatch! Not a palindrome.
                }
                // If they match, move both pointers closer to the center
                left++;
                right--;
            }
        }
        
        // If the pointers successfully met or crossed without mismatch, it's a palindrome
        return true;
    }
}
