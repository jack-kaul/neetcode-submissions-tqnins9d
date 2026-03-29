class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String lcp = strs[0];
        for(String str : strs) {
            lcp = computeLCP(lcp,str);
            if(lcp == "") return "";
        }
        return lcp;
    }

    private String computeLCP(String lcp, String str) {
        String res = "";
        if(str.startsWith(lcp)) return lcp;
        int loopTo = lcp.length() < str.length() ? lcp.length() : str.length();
        for(int i=0; i < loopTo; i++) {
           if(lcp.charAt(i) == str.charAt(i)) {
            res = res + lcp.charAt(i);
           } else {
            break;
           }
        }
        return res;
    }
}