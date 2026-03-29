class Solution {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        String result = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (containsAll(sub, t)) {
                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        result = sub;
                    }
                }
            }
        }

        return result;
    }

    private static boolean containsAll(String sub, String t) {
        int[] freq = new int[128]; // ASCII

        for (char c : sub.toCharArray()) {
            freq[c]++;
        }

        for (char c : t.toCharArray()) {
            if (freq[c] == 0) return false;
            freq[c]--;
        }

        return true;
    }
}
