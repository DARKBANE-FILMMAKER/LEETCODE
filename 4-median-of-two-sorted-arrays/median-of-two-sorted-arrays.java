class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to optimize the binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2;
        
        int low = 0;
        int high = m;
        
        while (low <= high) {
            int i = low + (high - low) / 2; // Partition in nums1
            int j = totalLeft - i;          // Partition in nums2
            
            // Boundary values around the partition lines
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
            
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];
            
            // Check if we found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If total number of elements is odd
                if ((m + n) % 2 != 0) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                // If total number of elements is even
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            } 
            else if (maxLeft1 > minRight2) {
                // i is too big, move left boundary
                high = i - 1;
            } 
            else {
                // i is too small, move right boundary
                low = i + 1;
            }
        }
        
        return 0.0;
    }
}