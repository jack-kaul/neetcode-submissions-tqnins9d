class Solution {
    public String mergeAlternately(String word1, String word2) {
        int c1 = 0, c2 =0;
        StringBuilder merged = new StringBuilder();
        while(c1 < word1.length() && c2 < word2.length()) {
            merged.append(word1.charAt(c1++));
            merged.append(word2.charAt(c2++));
        }

        while(c1 < word1.length()) {
            merged.append(word1.charAt(c1++));
        }

        while(c2 < word2.length()) {
            merged.append(word2.charAt(c2++));
        }
        return merged.toString();
    }
}