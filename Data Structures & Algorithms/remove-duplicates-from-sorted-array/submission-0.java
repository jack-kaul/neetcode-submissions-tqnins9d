class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        int start = 0, fwd = 0;
        while(fwd < nums.length) {
            if(nums[fwd] == nums[start]) {
                fwd++;
            } else {
                nums[++start] = nums[fwd++];
            }
        }
        return start + 1;
    }
}