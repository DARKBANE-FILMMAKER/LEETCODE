import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to store the character and its most recent index
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the map and within the current window,
            // jump the left pointer to the right of its last seen position.
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            
            // Update/insert the current character's index
            map.put(currentChar, right);
            
            // Calculate the window size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}