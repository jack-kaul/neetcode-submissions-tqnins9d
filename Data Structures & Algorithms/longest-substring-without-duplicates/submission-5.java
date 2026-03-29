class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> unique = new HashMap<>();
        int start = 0, end = 0, maxLen = 0;
        for(end=0; end < s.length(); end++) {
            if(unique.containsKey(s.charAt(end))) {
                int dup = unique.get(s.charAt(end));
                while(start <= dup) {
                    unique.remove(s.charAt(start));
                    start++;
                }
            }
            unique.put(s.charAt(end), end);
            maxLen = unique.size() > maxLen ? unique.size() : maxLen;
        }
        return maxLen;
    }
}
