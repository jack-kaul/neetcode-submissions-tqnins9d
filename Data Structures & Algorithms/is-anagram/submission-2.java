class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charFreq = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c,1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!charFreq.containsKey(c)) return false;
            if(charFreq.get(c) == 1) {
                charFreq.remove(c);
            } else {
                charFreq.put(c, charFreq.get(c)-1);
            }
        }
        return charFreq.size() == 0;
    }
}
