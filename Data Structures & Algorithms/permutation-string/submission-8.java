class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];

        // Count characters of s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0, right = 0;
        int required = s1.length();

        while (right < s2.length()) {
            char rChar = s2.charAt(right);

            if (count[rChar - 'a'] > 0) {
                required--;
            }

            count[rChar - 'a']--;
            right++;

            if (required == 0) {
                return true;
            }

            if (right - left == s1.length()) {
                char lChar = s2.charAt(left);

                if (count[lChar - 'a'] >= 0) {
                    required++;
                }

                count[lChar - 'a']++;
                left++;
            }
        }

        return false;
    }
}
