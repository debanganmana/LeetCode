import java.util.ArrayList;

class Solution { 
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        // 1. Create the temporary list to store the merged elements
        ArrayList<Integer> list = new ArrayList<>(); 
        
        // 2. Explicitly declare and initialize your pointers i and j
        int i = 0; 
        int j = 0;
        
        // 3. Use '&&' for logical AND. Loop while both arrays have elements left.
        while (i < m && j < n) { 
            if (nums1[i] <= nums2[j]) { 
                list.add(nums1[i]); // Use .add() instead of array syntax
                i++;                // Separate index increment with a semicolon
            } 
            else { 
                list.add(nums2[j]); 
                j++; 
            } 
        } 
        
        // 4. Clean up any remaining elements from nums1
        while (i < m) { 
            list.add(nums1[i]); 
            i++; 
        } 
        
        // 5. Clean up any remaining elements from nums2
        while (j < n) { 
            list.add(nums2[j]); 
            j++; 
        } 
        
        // 6. Fix the "in-place" requirement: Copy everything back into nums1
        for (int k = 0; k < list.size(); k++) {
            nums1[k] = list.get(k);
        }
    } 
}
