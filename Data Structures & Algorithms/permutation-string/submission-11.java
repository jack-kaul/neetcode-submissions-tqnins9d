class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(n1 > n2) return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i=0; i < n1; i++) {
            f1[s1.charAt(i) - 'a']++;
        }

        int i=0, j=0;
        while(j < n2) {
            f2[s2.charAt(j) - 'a']++;

            if(j-i+1 > n1) {
                f2[s2.charAt(i) - 'a']--;
                i++;
            }

            if(Arrays.equals(f1, f2)) return true;

            j++;        
        }

        return false;
    }
}
