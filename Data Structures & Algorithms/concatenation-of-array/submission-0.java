class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concatenated = new int[2*n];
        for(int i=0;i<n;i++) {
            concatenated[i] = nums[i];
            concatenated[i+n] = nums[i];
        }
        return concatenated;
    }
}