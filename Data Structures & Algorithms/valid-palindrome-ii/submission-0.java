class Solution {
    public boolean validPalindrome(String s) {
        boolean canBePalindrome = false;
        for(int i = 0; i< s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            canBePalindrome = canBePalindrome || isPalindrome(sb.toString());
        }
        return canBePalindrome;
    }

    private boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int start=0, end = s.length() -1;
        while (start <= end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--))) {
                return false;
            }
        }
        return true;
    }
}