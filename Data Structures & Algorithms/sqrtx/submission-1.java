class Solution {
    public int mySqrt(int x) {
        int i =1;
        while(x >= (long)i*i) {
            i++;
        }
        return i-1;
    }
}