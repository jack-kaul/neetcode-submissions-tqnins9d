class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String lcp = strs[0];
        for(String str : strs) {
            while(!str.startsWith(lcp)) {
                lcp = lcp.substring(0, lcp.length()-1);
            }
            if(lcp.length() == 0) return "";
        }
        return lcp;
    }
}