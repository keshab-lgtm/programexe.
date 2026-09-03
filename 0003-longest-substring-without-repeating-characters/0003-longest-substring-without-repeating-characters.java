class Solution {
    public int lengthOfLongestSubstring(String s) {
        
   int[] lastSeen = new int[128];
        int maxLen = 0, start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start, lastSeen[s.charAt(i)]);
            maxLen = Math.max(maxLen, i - start + 1);
            lastSeen[s.charAt(i)] = i + 1;
        }
        return maxLen;
    }
}